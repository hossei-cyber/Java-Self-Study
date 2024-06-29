package Advance;
import java.math.BigInteger;
public class prime {
    public  static boolean prime(int n){
        BigInteger b = BigInteger.valueOf(n);
        return b.isProbablePrime(1);
    }
    public static int nextPrime(int n){
        BigInteger b = BigInteger.valueOf(n);
        String a = b.nextProbablePrime().toString();
        return Integer.parseInt(a);
    }
    public static void main(String[] args){
        System.out.println(prime(5));
        System.out.println(nextPrime(5));
    }
}
