package String;

public class pattern {
    public static void main(String[] args) {
        String s = "ABCABCD";
        String p = "ABCD";
        System.out.println(findPattern(s, p));
    }

    public static int findPattern(String s, String p){
        // code here
        return s.indexOf(p);

    }
}
