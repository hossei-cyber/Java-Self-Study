import java.util.*;
public class getSmaller {
    static List<Integer> smaller(int arr[], int k)
    {
        List<Integer> al = new ArrayList<>(); // declaring arraylist

        for(int i = 0; i < arr.length; i++) // for each loop for array to extract elements
        {
            if(arr[i] < k) // checking if the element in array is smaller than k
            {
                al.add(arr[i]); // adding the element to arraylist
            }
        }
        return al;
    }
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 3;
        List<Integer> result = smaller(arr, k);

        System.out.println("Numbers smaller than " + k + " are:");
        for(int num : result) // for each loop to print the elements of arraylist result
        {
            System.out.println(num + " ");
        }
    }
    
}
