import java.io.*;
import java.util.*;

class demo{
    public static void main (String [] args){

        // Size of the arraylist
        int n = 5;

        // declaring it with in the size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);

        //Appending new elements at the end
        for(int i = 1; i <= n; i++){
            arrli.add(i);
            System.out.println(arrli);

            //remove the element at index 1
            arrli.remove(1);
            System.out.println(arrli);

            //print the elemnets one by one
            for(int i = 0; i <= arrli.size(); i++){
                System.out.println(arrli.get(i) + " ");
            }


        }
    }
}