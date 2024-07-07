package Collectionframework;
import java.util.*;
class generic <T, S>{
    public static <T> int count(T[] array, T item){
        int count = 0;
        // Counting the number of occurrences of the item in the array
        for(T i : array){
            if(i.equals(item)){
                ++count;
            }
        }
        return count;
    }
        public static void main(String[] args) {
            // Creating an array of integers
            Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            System.out.println(count(arr, 2));
            System.out.println(count(arr, 5));
            System.out.println(count(arr, 10));
        }

}
