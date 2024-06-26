import java.util.*;
public class listDemo {
    public static void main (String [] args){
        // Create a List
        List<Integer> numbers = new ArrayList<>();
        // Add elements to the list
        numbers.add(1);
        // Add 2 at index 1
        numbers.add(1, 2);
        System.out.println(numbers);

        // Creating another List
        List<Integer> newNumbers = new ArrayList<>();

        // Add elements to the new list
        newNumbers.add(3);
        newNumbers.add(4);
        newNumbers.add(5);
        System.out.println(newNumbers);

        //will add list 2 from index 1
        numbers.addAll(0, newNumbers);
        System.out.println(numbers);

        // Remove element at index 1
        numbers.remove(1);
        System.out.println(numbers);

        //prints element at index 3
        System.out.println(numbers.get(3));

        // replace 0th element with 5
        numbers.set(0, 5);
        System.out.println(numbers);
    }
    
}
