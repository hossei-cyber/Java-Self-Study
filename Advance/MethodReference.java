package Advance;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String [] args){
        List<Integer> al = Arrays.asList(10, 20, 15, 16); // Creating a list
        al.forEach(x -> System.out.println(x));
        // Using lambda expression to print the elements of list

        // Using method reference to print the elements of list
        al.forEach(System.out::println);


        String a[] = {"GFG", "IDE", "Courses"};
        String b[] = {"gfg", "ide", "courses"};

        if(Arrays.equals(a, b, String::compareToIgnoreCase)) // Using method reference to compare the arrays
            System.out.println("Both arrays are equal");
        else
            System.out.println("Both arrays are not equal");

    }
}

