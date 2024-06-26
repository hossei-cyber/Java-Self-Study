import java.util.ArrayList;
import java.util.Collections;


class operation{
    //For adding element
    public static void add(ArrayList<Integer> A, int x){
        A.add(x);
    }
    //Sorting in Ascending order
    public static void sort_asc(ArrayList<Integer> A){
        Collections.sort_asc(A);
    }
    //Reverse an ArrayList
    public static void reverse(ArrayList<Integer> A){
        Collections.reverse(A);
    }

    // size of ArrayList
    public static void size(ArrayList<Integer> A){
        return A.size();
    }

    //Sorting in descending Order
    public static void sort_desc(ArrayList<Integer> A){
        Collections.sort_desc(A, Collections.reverseOrder());
    }

    // printing the elements of ArrayList
    public static void elements(ArrayList<Integer> A){
        for(int i = 0; i < A.size(); i++){
            System.out.print(A.get(i) + " ");
        }
    }

    public static void main (String []args ){
        ArrayList<Integers> list = new Arraylist<>();

        //Using add method
        operation.add(list, 5);
        operation.add(list, 3);
        operation.add(list, 4);
        operation.add(list, 6);
        operation.add(list, 1);

        System.out.println("Initial elements: " + operation.elements(list));

        //using sort method
        operation.sort_asc(list);
        System.out.println("sorted- in ascending order: " + operation.elements(list));

        //using reverse method
        operation.reverse(list);
        System.out.println("reversed: " + operation.elements(list));

        //using size method
        System.out.println("size: " + operation.size(list));

        //using sorting in descending order
        operation.sort_desc(list);
        System.out.println("sorted- in descending order " + operation.elements(list));
    }
}