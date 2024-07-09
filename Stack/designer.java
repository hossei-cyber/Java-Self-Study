package Stack;
import java.util.*;
public class designer {
    public static Stack<Integer>_push(ArrayList<Integer> arr,int n)
    {
        //Your code here
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++){
            s.push(arr.get(i));
        }
        return s;

    }

    public static void _pop(Stack<Integer>s)
    {
        //Your code here
        while(!s.isEmpty()){
            System.out.print(s.pop()+ " ");
        }

    }
    public static void main(String []args ){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int n = arr.size();
        Stack<Integer> s = _push(arr, n);
        _pop(s);
    }
}
