package folderArray;

public class arrayTraverse {
    public static void main(String[] args){
        traverse(new int[]{1, 2, 3, 4, 5});
    }
    public static void traverse(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
