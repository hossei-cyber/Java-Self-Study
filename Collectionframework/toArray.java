package Collectionframework;
import java.util.*;

class toArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Converting list to array t[] = new t[list.size()];
        Integer[] arr1 = new Integer[list.size()];
        arr1 = list.toArray(arr1);
        for (Integer x : arr1) {
            System.out.println(x + " ");
        }

        // Converting list to array Object[] arr = list.toArray();
        Object[] arr = list.toArray();
        System.out.println("Array elements: ");
        for (Object x : arr) {
            System.out.println(x + " ");

        }

        //
    }
}