import java.util.*;

public class backwardTraversal {
    public static void main(String [] args){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        ListIterator<Integer> it = numbers.listIterator(numbers.size());

        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    
    }
}
