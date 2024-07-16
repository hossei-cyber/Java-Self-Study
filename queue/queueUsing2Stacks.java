package queue;
import java.util.*;
public class queueUsing2Stacks {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
        // Your code here
        s1.push(x);
    }


    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        // Your code here
        if(s1.isEmpty() && s2.isEmpty()){
            return -1;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public static void main(String []args ){
        queueUsing2Stacks q = new queueUsing2Stacks();
        q.Push(2);
        q.Push(3);
        q.Push(4);
        System.out.println(q.Pop());
        q.Push(5);
        System.out.println(q.Pop());
    }
}
