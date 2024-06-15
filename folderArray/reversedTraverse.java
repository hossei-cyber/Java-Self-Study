package folderArray;

public class reversedTraverse {
    public static void main(String[] args){
        traverseReversed(new int[]{1, 2, 3, 4, 5});
    }
    public static void traverseReversed(int[] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
