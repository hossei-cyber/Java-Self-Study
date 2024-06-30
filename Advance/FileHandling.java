package Advance;
import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main (String [] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            // Creating 2 files
            File inputFile = new File("input.txt");
            File outputFile = new File("output.txt");

            // Checking if the files exist or not
            if(!inputFile.exists()){
                inputFile.createNewFile(); // If the file does not exist, create a new file
            }
            if(!outputFile.exists()){ // same as above
                outputFile.createNewFile();
            }

            // Writing to the file
            FileWriter fw = new FileWriter(inputFile);
            fw.write("My name is Hossay");
            fw.close(); // Closing the file
            System.out.println("File written successfully");

            // Reading from the file
            Scanner sc = new Scanner(inputFile);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close(); // Closing the file

            // Checking the properties of the file
            if(inputFile.exists()){
                System.out.println(inputFile.getName());
                System.out.println(inputFile.getAbsolutePath());
                System.out.println(inputFile.length());
                System.out.println(inputFile.canRead());
                System.out.println(inputFile.canWrite());
            }
            else{
                System.out.println("File does not exist");
            }

            // Copying the content of one file to another
            in = new FileInputStream(new File("input.txt"));
            out = new FileOutputStream(new File("output.txt"));
            int c;
            while ((c = in.read()) != -1) { // Reading the content of the file
                out.write(c); // Writing the content to the file
            }
            System.out.println("File copying completed successfully.");
        } catch (IOException e) { // Catching the exception
            e.printStackTrace(); // Printing the exception
        }
            finally { // Finally block
                if(in != null){ // Checking if the input file is open or not
                    in.close(); // Closing the file
                }
                if(out != null){ // Checking if the output file is open or not
                    out.close(); // Closing the file
                }
            }
    }
}
