package Methods;

public class firstDigitWithLoop {
    public static void main (String []args ){
        int n = 12345;
        System.out.println(firstDigit(n));
    }
    public static int firstDigit(int n){
        while (n >= 10){
            n /= 10;
        }
        return n;
    }
}
