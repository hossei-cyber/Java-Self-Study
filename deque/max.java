package deque;
import java.util.*;

class Max {
    static void printMax(int arr[], int n, int k) {
        Deque<Integer> dq = new ArrayDeque<>();

        int i;

        for (i = 0; i < k; i++) { // int his case k is 3 so we are adding 3 elements to the deque
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) { // if the last element of the deque is less than the current element then remove the last element
                // here last element is 3 and current element is 1 so we are removing 3 and then adding 1 and same for 2
                // at the end of the loop the deque will have 3, 2, 1
                dq.removeLast(); // after this the deque will have 3, 2
            }
            dq.addLast(i); // after this the deque will have 3, 2, 1
        }
        // coming out of the loop we have now a deque with 3, 2, 1 with 3 in the front and 1 in the end

        for (; i < n; i++) { // here we are starting from 3 and going till the end of the array
            System.out.print(arr[dq.peek()] + " "); // printing the first element of the deque which is 3 and thats the max of the first 3 elements

            while (!dq.isEmpty() && dq.peek() <= i - k) { // here we are checking if i which is 3 is greater than or equal to k which is 3 then remove the first element of the deque which is 3
                dq.removeFirst(); // after this the deque will have 2, 1 and we keep removing the first element till the condition is satisfied
            }
            // after this while we have 2, 1 in the deque
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) { // and now if the last element of the deque is less than the current element then remove the last element
                dq.removeLast(); // after this the deque will have 2 and we keep removing the last element till the condition is satisfied
            }
            // after this while we have 2 in the deque as 1 is less than 2 and we add the current element to the deque

            dq.addLast(i);
            // after coming out of this loop we have 2, 1, 5 in the deque and we print the first element of the deque which is 2 and we keep doing this till the end of the array
        }
        // after this loop we have 6, 5, 3 in the deque and we print the first element of the deque which is 6
        System.out.print(arr[dq.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        int n = arr.length;
        printMax(arr, n, k);
    }
}
