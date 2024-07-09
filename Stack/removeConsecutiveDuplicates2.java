package Stack;
import java.util.*;
public class removeConsecutiveDuplicates2 {
    public static String removePair(String str)
    {
        // your code here
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!st.isEmpty() && st.peek() == currentChar) {
                st.pop();
            } else {
                st.push(currentChar);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
    public static void main(String []args ){
        String str = "aabbcddebb";
        System.out.println(removePair(str));
    }
}
