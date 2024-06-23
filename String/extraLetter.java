package String;
import java.util.Arrays;

public class extraLetter {
public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Helloo";
    System.out.println(extraChar(s1, s2));
}
    public static char extraChar(String s1, String s2){

        //write your code here
        char []a1 = s1.toCharArray();
        Arrays.sort(a1);
        char []a2 = s2.toCharArray();
        Arrays.sort(a2);
        int n = s1.length();
        for(int i = 0; i < n; i++){
            if(a1[i]!= a2[i]){
                return a2[i];
            }
        }
        return a2[n];


    }
}
