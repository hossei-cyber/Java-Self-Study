package Alogrithms;

public class insertionSort {
    void sort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i]; // the element at the index 1
            int j = i -1; // in the element at the index 0

            while(j >= 0 && arr[j] > key){ // while the element at the index 0 is greater than the element at the index 1
                arr[j+1] = arr[j]; // the element at the index 0 is moved to the index 1
                j = j-1; // the element at the index 0 is decremented
            }
            arr[j +1] = key; // the element at the index 1 is moved to the index 0
        }
    }
    static void printArray(int arr []){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String []args){
        insertionSort ob = new insertionSort();
        int arr[] = {12, 11, 13, 5, 6};
        printArray(arr);
        ob.sort(arr);
        printArray(arr);
    }

}
