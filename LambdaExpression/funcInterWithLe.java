package LambdaExpression;
import java.util.*;
import java.util.function.Predicate;
// functional interface with lambda expression
class funcInterWithLe {
    static void printCond(Collection<Integer> c, Predicate<Integer> p) {
        for (Integer x : c)
            if (p.test(x))
                System.out.print(x + " ");
    }
    public static void main(String[]args){
        List<Integer> al = new ArrayList<>(Arrays.asList(10, 5, 20, 40));
        printCond(al, x -> x % 2 == 0);
    }
}
