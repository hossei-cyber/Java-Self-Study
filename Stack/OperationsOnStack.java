package Stack;
import java.util.*;
public class OperationsOnStack {
    public static void insert(Stack<Integer> st, int x)
    {
        // Your code here
        st.push(x);
    }

    //Function to remove top element from stack.
    public static void remove(Stack<Integer> st)
    {
        // Your code here
        st.pop();
    }

    //Function to print the top element of stack.
    public static void headOf_Stack(Stack<Integer> st)
    {
        // Your code here
        if(!st.isEmpty()){
            System.out.println(st.peek());
        }
    }

    //Function to search an element in the stack.
    public static boolean find(Stack<Integer> st, int val)
    {
        // Your code here
        return st.contains(val);

    }
public static void main(String []args ){
        Stack<Integer> st = new Stack<>();
        insert(st, 1);
        insert(st, 2);
        insert(st, 3);
        insert(st, 4);
        insert(st, 5);
        remove(st);
        headOf_Stack(st);

        System.out.println(find(st, 3));
    }
}
