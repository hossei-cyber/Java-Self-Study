package Alogrithms;

class bubbleSort {
    void bubblesort(int arr []){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++ ){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String []args){
        bubbleSort ob = new bubbleSort();
        int arr[] = {1, 2, 8, 5, 9, 3, 8, 9, 1};
        ob.printArray(arr);
        System.out.print("Sorted Array: ");
        ob.bubblesort(arr);
        ob.printArray(arr);
    }
}
