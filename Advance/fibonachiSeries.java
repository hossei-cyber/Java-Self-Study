package Advance;
import java.math.BigInteger;

public class fibonachiSeries {
    public static void main(String[] args){
        int n = 100;
        BigInteger fib[] = new BigInteger[n];
        fib[0] = BigInteger.ZERO; //initializing the first two elements
        fib[1] = BigInteger.ONE;
        for(int i = 2; i <n; i++){ //looping through the array
            fib[i] = fib[i - 1].add(fib[i-2]); //calculating the fibonacci series using the formula f(n) = f(n-1) + f(n-2)
        }
        for(int j = 0; j < n; j++){ //printing the fibonacci series
            System.out.println(fib[j]);
        }
    }
}

/*public static BigInteger fib(int n){

    //write your code here
    //return nth fibonacci number in BigInteger
    BigInteger a = BigInteger.valueOf(0);
    BigInteger b = BigInteger.valueOf(1);
    BigInteger c = BigInteger.valueOf(1);

    for(int i = 2; i <= n; i++){
        c = a.add(b);
        a = b;
        b = c;
    }
    return c;

}
*/
