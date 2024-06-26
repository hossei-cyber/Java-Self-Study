import java.util.ArrayList;

public class sorted {
    public static boolean isSorted(ArrayList<Integer> numbers){
    boolean ascending = true;
    boolean descending = true;
    
        for(int i = 1; i < numbers.size(); i++){
            if(numbers.get(i) < numbers.get(i -1)){
                ascending = false;
            }
            if(numbers.get(i) > numbers.get(i - 1)){
            descending = false;
            }

        }
        return ascending || descending;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        System.out.println(isSorted(numbers));
    }
    
}
