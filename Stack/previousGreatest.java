package Stack;
import java.util.*;
public class previousGreatest {
    // Function to find the previous greater element
    static void prevGreater(int arr[])
    {
        // Create a stack and push the first element
        Deque<Integer> stack = new ArrayDeque<Integer>();

        stack.push(arr[0]);
        int pg = -1; // previous greater element

        System.out.print(pg + " "); //  print -1 for the first element

        // Traverse the array elements
        for(int i = 1; i < arr.length; i++)
        {
            // if stack is empty, print -1 and push the element to stack
            while(stack.isEmpty()==false &&
                    stack.peek() <= arr[i])
            {
                // pop the top of stack if it is less than or equal to the current element
                stack.pop();
            }

            // if stack is empty, print -1, else print the top of stack
            pg = (stack.isEmpty())? -1 :  stack.peek();
            System.out.print(pg + " "); // print the previous greater element
            // push the current element to stack
            stack.push(arr[i]);
        }
    }
    public static void main(String []args ){
        int arr[] = {15, 10, 18, 12, 4, 6, 2, 8};
        prevGreater(arr);
    }
}
