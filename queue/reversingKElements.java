package queue;
import java.util.*;
public class reversingKElements {
    static void reverseK(Queue<Integer> q, int k){
        if(q.size()< 0 || k < 0){
            return;
        }
        Deque<Integer> stack = new ArrayDeque<Integer>();

        for(int i = 0; i < k; i++){
            stack.offerLast(q.poll()); // pop the first k elements and push them to stack
        }
        while(stack.isEmpty() == false)
            q.offer(stack.pollLast()); // q.offer means push the element to the queue and stack.pollLast means pop the element from the stack

        for(int i = 0; i < q.size() - k; i++){
            q.offer(q.poll()); // pop the remaining elements from the queue and push them to the queue
        }
    }
    public static void main(String []args ){
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        q.offer(60);
        q.offer(70);
        q.offer(80);
        q.offer(90);
        q.offer(100);

        System.out.println("Queue before reversing: " + q);
        int k = 5;
        reverseK(q, k);
        System.out.print("Queue after reversing: ");
        while(q.isEmpty() == false){
            System.out.print(q.poll() + " ");
        }
    }
}
