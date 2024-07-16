package deque;
import java.util.*;
public class deletion {
    //Function to erase the element from specified position X in deque.
    public static void eraseAt(ArrayDeque<Integer> deq , int X)
    {
        //Your code here
        List<Integer> list = new ArrayList<>(deq);
        list.remove(X);
        deq.clear();
        deq.addAll(list);
    }

    //Function to erase the elements in range start (inclusive), end (exclusive).
    public static void eraseInRange(ArrayDeque<Integer> deq , int start, int end)
    {
        if (start == end) return;
        List<Integer> list = new ArrayList<>(deq);
        for (int i = end - 1; i >= start; i--) {
            list.remove(i);
        }
        deq.clear();
        deq.addAll(list);
    }

    //Function to erase all the elements in the deque.
    public static void eraseAll(ArrayDeque<Integer> deq )
    {
        //Your code here
        deq.clear();
    }
    public static void main(String []args ){
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        deq.add(10);
        deq.add(20);
        deq.add(30);
        deq.add(40);
        eraseAt(deq, 2);
        System.out.println(deq);
        eraseInRange(deq, 1, 3);
        System.out.println(deq);
        eraseAll(deq);
        System.out.println(deq);
    }
}
