package folderArray;

import java.util.Scanner;

class findAverage {

    public static double average(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        double avg=(double)sum/a.length;
        return avg;
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
        System.out.print(average(a));
    }
}

