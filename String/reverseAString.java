package String;

public class reverseAString {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s){
        // code here
        String a = "";
        int n = s.length()-1;
        while(n >= 0){
            a = a + s.charAt(n);
            n--;
        }
        return a;

    }
}
