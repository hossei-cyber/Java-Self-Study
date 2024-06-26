import java.util.ArrayList;
class average{

    public static double posAverage(ArrayList<Integer> numbers){
    int pos = 0;
    int count = 0;
    
    for(int i = 0; i < numbers.size(); i++){
        if(numbers.get(i) >= 0){
            count++;
            pos += numbers.get(i);
        }
        
    }
    double average = (count > 0) ? (double) pos / count : 0.0;
    return average;
}

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(-2);
        numbers.add(3);
        numbers.add(-4);
        numbers.add(5);
        
        double result = posAverage(numbers);
        System.out.println("Average of positive numbers: " + result);
    }
}