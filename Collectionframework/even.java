package Collectionframework;
import java.util.*;
import java.util.Collection;
public class even {
    void removeEven(Collection<Integer> c){
        Iterator<Integer> it = c.iterator();
        // Traversing the collection
        while(it.hasNext()){
            int x = (Integer)it.next(); // Typecasting the object to Integer
            // Removing the element if it is even
            if(x % 2 == 0){
                it.remove();
            }
        }
    }
}
class Test1{
    public static void main(String[] args){
        even e = new even();
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("Original Collection: " + al);
        e.removeEven(al);
        System.out.println("Modified Collection: " + al);
    }
}
