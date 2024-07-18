package org.calc;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class ScientificCalculator extends JFrame {
    private JTextField field;
    private JTextField functionField;
    private MemoryStorage<Double> memoryStorage;
    private LinkedList<String> operationHistory;

    public ScientificCalculator() {
        initializeUI();
        memoryStorage = new MemoryStorage<>();
        operationHistory = new LinkedList<>();
    }

    private void initializeUI() {
        setTitle("New Study Scientific Calculator");
        setSize(600, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        field = new JTextField(20);
        field.setEditable(false);
        field.setFont(new Font("Arial", Font.BOLD, 24));
        field.setHorizontalAlignment(JTextField.RIGHT);
        field.setPreferredSize(new Dimension(400, 50));

        functionField = new JTextField(30);
        functionField.setFont(new Font("Arial", Font.PLAIN, 18));
        functionField.setPreferredSize(new Dimension(400, 30));
        functionField.setToolTipText("Enter function f(x), e.g., 'sin(x) * log(x)'");

        JPanel panel = new JPanel(new GridLayout(8, 5, 5, 5));
        JPanel functionPanel = new JPanel(new BorderLayout());
        functionPanel.add(functionField, BorderLayout.CENTER);

        String[] buttonLabels = {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "+", "-", "/", "*", "=", "C", "√", "exp", "!", "log",
                "sin", "cos", "tan", "1/x", "^", "MC", "MR", "M+", "M-", "Graph", "logBase"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(e -> handleAction(label));
            panel.add(button);
        }

        JButton bGraph = new JButton("Graph");
        bGraph.setFont(new Font("Arial", Font.BOLD, 18));
        bGraph.addActionListener(e -> plotGraph(functionField.getText()));
        functionPanel.add(bGraph, BorderLayout.EAST);

        add(field, BorderLayout.NORTH);
        add(functionPanel, BorderLayout.SOUTH);
        add(panel, BorderLayout.CENTER);
        setBackground(Color.gray);
        setVisible(true);
    }

    private void handleAction(String command) {
        final String currentText = field.getText();
        SwingUtilities.invokeLater(() -> {
            if (command.matches("[0-9.]")) {
                field.setText(currentText + command);
            } else if (command.equals("C")) {
                field.setText("");
            }else if(command.equals("MC")){
                memoryStorage.clear();
            }else if(command.equals("MR")){
                Double last = memoryStorage.getLast();
                if(last != null) try {
                    field.setText(last.toString());
                }catch (Exception e){
                    field.setText("Error: " + e.getMessage());
                }
            }else if(command.equals("M+")){
                Double last = memoryStorage.getLast();
                if(last != null){
                    memoryStorage.add(last + Double.parseDouble(field.getText()));
                }
            }else if(command.equals("M-")){
                Double last = memoryStorage.removeLast();
                if(last != null){
                    memoryStorage.add(last - Double.parseDouble(field.getText()));
                }
            } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
                field.setText(currentText + " " + command + " ");
            } else if (command.equals("√")) {
                double value = Double.parseDouble(currentText);
                field.setText("√" + value + " = " + Math.sqrt(value));
            } else if (command.equals("exp")) {
                double value = Double.parseDouble(currentText);
                field.setText("exp(" + value + ") = " + Math.exp(value));
            } else if (command.equals("!")) {
                int value = Integer.parseInt(currentText);
                int result = 1;
                for (int i = 1; i <= value; i++) {
                    result *= i;
                }
                field.setText(value + "! = " + result);
            } else if (command.equals("sin")) {
                double value = Double.parseDouble(currentText);
                field.setText("sin(" + value + ") = " + Math.sin(value));
            } else if (command.equals("cos")) {
                double value = Double.parseDouble(currentText);
                field.setText("cos(" + value + ") = " + Math.cos(value));
            } else if (command.equals("tan")) {
                double value = Double.parseDouble(currentText);
                field.setText("tan(" + value + ") = " + Math.tan(value));
            } else if (command.equals("1/x")) {
                double value = Double.parseDouble(currentText);
                field.setText("1/" + value + " = " + (1 / value));
            } else if (command.equals("^")) {
                field.setText(currentText + " ^ ");
            } else if (command.equals("log")) {
                double value = Double.parseDouble(currentText);
                field.setText("log(" + value + ") = " + Math.log(value));
            }
            else if (command.equals("=")) {
                executeOperation(currentText);
            } else if (command.equals("Graph")) {
                plotGraph(functionField.getText());
            } else if (command.equals("logBase")) {
                promptForLogBase();
            }
            else {
                field.setText(currentText + " " + command + " ");
            }
        });
    }

    private void promptForLogBase() {
        SwingUtilities.invokeLater(() -> {
            String baseStr = JOptionPane.showInputDialog(this, "Enter the base for the logarithm:");
            if (baseStr != null && !baseStr.isEmpty()) {
                try {
                    double base = Double.parseDouble(baseStr);
                    if (base > 0) {
                        double value = Double.parseDouble(field.getText().trim());
                        double result = Math.log(value) / Math.log(base);
                        field.setText("log_" + base + "(" + value + ") = " + result);
                    } else {
                        field.setText("Error: Base must be greater than zero");
                    }
                } catch (NumberFormatException ex) {
                    field.setText("Invalid input for base");
                }
            }
        });
    }

    private void executeOperation(String expression) {
        new Thread(() -> {
            try {
                Expression exp = new ExpressionBuilder(expression).build();
                double result = exp.evaluate();
                field.setText(Double.toString(result));
                memoryStorage.add(result);
                operationHistory.add(expression + " = " + result);
            } catch (Exception ex) {
                field.setText("Error: " + ex.getMessage());
            }
        }).start();
    }

    private void plotGraph(String function) {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            protected Void doInBackground() {
                XYSeries series = new XYSeries("f(x)");
                for (double x = -10; x <= 10; x += 0.1) {
                    double y = evaluateFunction(function, x);
                    series.add(x, y);
                }
                XYSeriesCollection dataset = new XYSeriesCollection(series);
                JFreeChart chart = ChartFactory.createXYLineChart(
                        "Graph of f(x)", "X", "Y", dataset, PlotOrientation.VERTICAL, true, true, false);
                ChartPanel chartPanel = new ChartPanel(chart);
                SwingUtilities.invokeLater(() -> {
                    JFrame graphFrame = new JFrame("Graph");
                    graphFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    graphFrame.getContentPane().add(chartPanel);
                    graphFrame.pack();
                    graphFrame.setVisible(true);
                });
                return null;
            }
        };
        worker.execute();
    }

    private double evaluateFunction(String function, double x) {
        Expression expression = new ExpressionBuilder(function).variables("x").build();
        expression.setVariable("x", x);
        return expression.evaluate();
    }

    public static void main(String[] args) {
        new ScientificCalculator();
    }
}

class MemoryStorage<T> {
    private LinkedList<T> memory = new LinkedList<>();

    public void clear() {
        memory.clear();
    }

    public T getLast() {
        if (!memory.isEmpty()) {
            return memory.getLast();
        }
        return null;
    }

    public void add(T item) {
        memory.add(item);
    }

    public T removeLast() {
        if (!memory.isEmpty()) {
            return memory.removeLast();
        }
        return null;
    }
}
