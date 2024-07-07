package LambdaExpression;
import java.util.*;
import java.util.function.Predicate;
// functional interface without lambda expression
class funcInterWithoutLE {
    static void printCond(Collection <Integer> c, Predicate <Integer> p){
        for (Integer x: c){
            if(p.test(x)){
                System.out.println(x + " ");
            }
        }
    }
    public static void main(String args[]) {
        // Predicate to print even numbers
        class MyPredicateEven implements Predicate <Integer>{
            // test method
            public boolean test(Integer x)
            {
                return(x % 2 == 0);
            }
        }
        // Creating a list and adding elements
        List<Integer> al = new ArrayList<>(Arrays.asList(10, 5, 20, 4));
        // Calling the method to print even numbers
        printCond(al, new MyPredicateEven());
    }
}
