package Loops;

public class divisor {
    public static void main (String [] args){
        int n = 10;
        System.out.print("Divisors of " + n + " are: ");
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
