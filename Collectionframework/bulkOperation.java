package Collectionframework;
import java.util.*;
public class bulkOperation {
    public static void main(String[] args) {
        // Creating empty list
        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        // Creating 2nd empty list
        List<Integer> list2 = new ArrayList<Integer>();

        list2.add(10);
        list2.add(30);

        // boolean ContainsAll method
        System.out.println("containsAll method: "+ list1.containsAll( list2)); //OP is true

        // boolean addAll method
        list1.addAll(list2);
        System.out.println("Adding list2 to list1 "+list1);

        // boolean removeAll method
        list1.removeAll(list2);
        System.out.println("removing all items of list2 "+list1);

        // boolean retainAll method
        list1.retainAll(list2);
        System.out.println("retainAll "+list1);

        //boolean removeIf(Predicate filter)
        list1.removeIf(n -> (n % 2 == 0));
        System.out.println("removeIf: "+list1);


    }
}
