package deque;
import java.util.*;
public class rotation {
    public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
    {
        //Your code here
        k = k % n;

        for (int i = 0; i < k; i++) {
            Integer temp = deque.pollFirst();
            deque.offerLast(temp);
        }
    }

    //Function to rotate deque by k places in clockwise direction.
    public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
    {
        //Your code here
        k = k % n;

        for(int i = 0; i < k; i++){
            Integer temp = deque.pollLast();
            deque.offerFirst(temp);
        }
    }
    public static void main(String []args ){
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deq.offer(arr[i]);
        }
        left_Rotate_Deq_ByK(deq, n, 2);
        System.out.println(deq);
        right_Rotate_Deq_ByK(deq, n, 2);
        System.out.println(deq);
    }
}
