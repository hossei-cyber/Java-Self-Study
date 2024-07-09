package Stack;
import java.util.*;
public class removeConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str)
    {
        // Your code here
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // If the stack is empty or the top character is not the same as the current character, push the current character
            if (st.isEmpty() || st.peek() != currentChar) {
                st.push(currentChar);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character ch : st) {
            result.append(ch);
        }
        return result.toString();
    }
    public static void main(String []args ){
        String str = "aabbccddjaanyaa";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
