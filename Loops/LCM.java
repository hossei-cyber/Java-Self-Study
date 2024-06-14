package Loops;

public class LCM {
    public static void main (String [] args){
        int a = 3;
        int b = 6;
        int big = Math.max(a, b);
        for(int i = big; i <= a*b; i += big){
            if(i % a == 0 && i % b == 0){
                System.out.println("Loops.LCM of " + a + " and " + b + " is " + i);
                break;
            }
        }
    }
}
