package folderArray;
import java.util.Scanner;

class sortedArray {

    public static boolean isSorted(int[] a,int n){
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=s.nextInt();
        System.out.println("Enter the elements of the array: ");;
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        boolean ans=isSorted(a,n);
        if(ans==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

