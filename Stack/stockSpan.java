package Stack;
import java.util.*;
public class stockSpan {
    public void printScan(int arr[]) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(0);
        int span = 1;
        for (int i = 0; i < arr.length; i++) {
            while (stack.isEmpty() == false // stack is not empty
                    && arr[stack.peek()] <= arr[i]) { // the top of stack is less than or equal to the current element
                stack.pop(); // pop the top of stack
            }
            span = (stack.isEmpty()) ? (i + 1) : (i - stack.peek()); // if stack is empty, span is i+1, else i - top of stack
            System.out.print(span + " ");
            stack.push(i);
        }
    }
    public static void main(String []args ){
        int arr[] = {60, 10, 20, 40, 35, 38, 50, 70, 65};
        stockSpan obj = new stockSpan();
        obj.printScan(arr);
    }
}
