package Loops;

public class max {
    static void printMax(int arr[], int n, int k){
        int j,  max;
        for(int i = 0; i <= n -k; i++){ // n - k is used to avoid out of bound exception
            max = arr[i];
            for(j = 1; j < k; j++){ // j < k is used to get the next k elements
                if(arr[i + j] > max){ // i + j is used to get the next element
                    max = arr[i + j];
                }
            }System.out.print(max + " ");
        }
    }
    public static void main (String [] args){
        int arr[] = {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
        int k = 3;
        int n = arr.length;
        printMax(arr, n, k);
    }
}
