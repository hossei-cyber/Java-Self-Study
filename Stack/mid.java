package Stack;
import java.util.*;
public class mid {
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int middleIndex = sizeOfStack / 2;
        deleteMiddleHelper(s, middleIndex);

    }
    private void deleteMiddleHelper(Stack<Integer> s, int middleIndex) {
        if (middleIndex == 0) {
            s.pop();
            return;
        }
        int topElement = s.pop();

        deleteMiddleHelper(s, middleIndex - 1);

        s.push(topElement);
    }
    public static void main(String []args ){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int n = st.size();
        mid obj = new mid();
        obj.deleteMid(st, n);
        while(!st.isEmpty()){
            System.out.print(st.pop()+ " ");
        }
    }
}
