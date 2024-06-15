package Methods;

public class printPrimefactorization {
    public static void main (String [] args ){
        int n = 100;
        primeFactorization(n);
    }
    public static void primeFactorization(int n){
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(i + " ");
                    x *= i;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
