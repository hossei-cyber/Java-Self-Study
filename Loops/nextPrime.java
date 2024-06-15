package Loops;

public class nextPrime {
    public static void main (String [] args){
        int n = 50;
        int[] array = new int[50];
        for(int i = 1; i < n; i++){
            if(n % i != 0){
                array[i] = i;
            }
            System.out.println(array[i]);
        }
    }

}
