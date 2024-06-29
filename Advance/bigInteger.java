package Advance;
import java.math.BigInteger;

public class bigInteger {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static BigInteger factorial(int x){

        //write your code here
        //return factorial of x as datatype of BigInteger
        BigInteger f = new BigInteger("1");
        for(int i = 1; i <= x; i++){
            BigInteger a = BigInteger.valueOf(i);
            f = f.multiply(a);
        }
        return f;

    }
}
