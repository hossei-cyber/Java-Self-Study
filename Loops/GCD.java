package Loops;

public class GCD {
    public static void main (String[] args){
        int a = 5;
        int b = 15;
        int ans = 1;
        int smaller = Math.min(a, b);
        for(int i = 1; i <= smaller; i++){
            if(a % i == 0 && b % i == 0){
                ans = i;
            }
        }
        System.out.println("Loops.GCD of " + a + " and " + b + " is " + ans);
    }
}
