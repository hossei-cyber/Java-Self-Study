package Loops;

public class isPrime {
    public static void main(String[] args){
        int n = 17;
        boolean isPrime = true;
        if (n == 1) {
            isPrime = false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println("Is " + n + " prime? " + isPrime);

    }
}
