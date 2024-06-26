import java.util.*;

public class forwardTraversal {
    public static void main(String []args ){
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        //Iterator point to first elemment
        ListIterator<Integer> it = numbers.listIterator();

        //While we have a next element
        while(it.hasNext()){
            //Print the element and move to next
            System.out.println(it.next());
        }
    }
    
}
