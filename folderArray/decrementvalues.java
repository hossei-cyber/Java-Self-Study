package folderArray;

public class decrementvalues {
    public static void main(String[] args){
        decrement(new int[]{1, 2, 3, 4, 5});
    }
    public static void decrement(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i]--;
            System.out.print(arr[i] + " ");
        }
    }
}
