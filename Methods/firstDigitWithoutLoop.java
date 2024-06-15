package Methods;

public class firstDigitWithoutLoop {
    public static void main (String [] args){
        int n = 12345;
        System.out.println(firstDigit(n));
    }
    public static int firstDigit(int n ){
        double power = Math.log10(n); // ans = 4.19
        int p = (int)power; // ans = 4
        int a = (int)Math.pow(10, p); // ans = 10000
        int ans = n/ a; // ans = 1
        return ans;

    }
}
