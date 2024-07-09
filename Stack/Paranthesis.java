package Stack;
import java.util.*;
class Paranthesis {

    // Function to check if the paranthesis are balanced
    static boolean isMatching(char a, char b){
        if(a == '(' && b == ')') return true;
        if(a == '{' && b == '}') return true;
        if(a == '[' && b == ']') return true;
        return false;
    }
    static boolean isBalanced(String str){
        // Create a stack
        Deque<Character> stack = new ArrayDeque<Character>();

        // Traverse the string
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            // if opening paranthesis, push it to stack
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                // if closing paranthesis, check if it matches with the top of stack
                if(stack.isEmpty()  == true) // if stack is empty and we have a closing paranthesis
                    return false;
                else if(isMatching(stack.peek(), c) == false) // else if the closing paranthesis does not match with the top of stack
                    return false;
                else
                    stack.pop(); // if it matches, pop the top of stack
            }
        }
        return stack.isEmpty(); // if stack is empty, paranthesis are balanced
    }
    public static void main(String []args ) {
        String str = "{()}[]";
        if (isBalanced(str) == true) {
            System.out.println(isBalanced(str));
        }
    }
}
