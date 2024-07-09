package ArrayList;
import java.util.*;
class ListExample<I extends Number> {
    public static void main(String [] args)
    {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 1);
        l1.add(1, 2);
        System.out.println(l1);

        List<Integer> l2 = new ArrayList<Integer>();

        l2.add(1);
        l2.add(2);
        l2.add(3);
        System.out.println(l2);

        l1.addAll(1, l2);
        System.out.println(l1);

        l1.remove(1);
        System.out.println(l1);

        System.out.println(l1.get(3));

        l1.set(0, 5);
        System.out.println(l1);

        //listIterator methods
        // forward traversal
        ListIterator<Integer> it = l1.listIterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();

        //backward traversal
        ListIterator<Integer> myIt = l1.listIterator(l1.size());
        while(myIt.hasPrevious()){
            System.out.print(myIt.previous() + " ");
        }

        System.out.println();

        //set() method
        ListIterator<Integer> myIt2 = l1.listIterator(l1.size());

        while(myIt2.hasPrevious()){
            int x = (Integer)myIt2.previous();
            myIt2.set( x * 2);
        }
        System.out.print(l1);
    }
}
