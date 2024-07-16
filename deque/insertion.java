package deque;
import java.util.*;
public class insertion {
    // traversal of deque
    public static void printDeque(ArrayDeque<Integer> deq)
    {
        Iterator<Integer> it = deq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static Deque<Integer> deque_Init(int arr[], int n) {

        Deque<Integer> dq = new ArrayDeque<Integer>();

        for (int i = 0; i < n; i++) {
            dq.offer(arr[i]);
        }

        return dq;
    }
    public static void main(String []args ){
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;
        Deque<Integer> dq = deque_Init(arr, n);
        System.out.println(dq);
        printDeque((ArrayDeque<Integer>) dq);
    }
}
