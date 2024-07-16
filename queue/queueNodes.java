package queue;
import java.util.*;
public class queueNodes {
    static void printFirstN(int N){
        Queue<String> q = new LinkedList<>();
        q.add("5");
        q.add("6");
        for(int count = 0; count < N; count++){
            String curr = q.poll();
            System.out.print(curr + " ");

            q.add(curr + "5");
            q.add(curr + "6");
        }
    }
    public static void main(String []args ){
        int N = 5;
        printFirstN(N);
    }
}
