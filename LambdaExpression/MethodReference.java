package LambdaExpression;
import java.util.*;

// comparing 2 cases ignoring the cases
public class MethodReference {
    public static void main(String [] args){
        String a[] = {"GFG", "IDE", "COURSES"};
        String b[] = {"gfg", "ide", "courses"};

        if(Arrays.equals(a, b, String::compareToIgnoreCase))
            System.out.println("Yes");
        else
            System.out.println("No");

        List<Integer> al = Arrays.asList(10, 20, 30, 40);

        // Using Method reference to print square of each element
        al.forEach(MethodReference::printSquare);

        // using lambda expression to print square of each element
        al.forEach(x-> System.out.println(x * x));

        // using lambda expression for filtering data
        al.stream().filter(x -> x > 20).forEach(x -> System.out.println(x));

        // using method reference for filtering data
        al.forEach(System.out::println);

    }
    public static void printSquare(Integer x){
        System.out.println(x * x);
    }

}
