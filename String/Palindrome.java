package String;
//palindrome
public class Palindrome {

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalin(s));
    }

    public static boolean isPalin(String s){
        String str = s.toUpperCase();
        int start = 0;
        int end = str.length() -1;
        boolean pal = true;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                pal = false;
                break;
            }
            start++; end--;
        }
        if(pal == true){
            return true;
        }
        return false;

    }
}
