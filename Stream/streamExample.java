package Stream;
import java.util.*;

class streamExample {
    public static void main(String [] args){
        int arr[] = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(arr)
                .sum();
        System.out.println("Sum of array elements: " + sum);

        int max = Arrays.stream(arr)
                .max()
                .getAsInt();
        System.out.println("Max of array elements: " + max);

        double avg = Arrays.stream(arr)
                .average()
                .getAsDouble();
        System.out.println("Average of array elements: " + avg);

        String arr1[] = {"abc","aec", "def", "ghi", "jkl"};

        Arrays.stream(arr1)
                .filter(x -> x.startsWith("a"))
                .filter(x -> x.endsWith("c"))
                .sorted()
                .forEach(System.out::println);

    }
}
