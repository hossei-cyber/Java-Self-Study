import java.util.*;
public class setMethod {
    public static void main(String [] args){

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        ListIterator<Integer> it = numbers.listIterator();

        while(it.hasNext()){
            int x = (Integer)it.next();

            it.set(x*2);
        }
        System.out.println(numbers);
    }
}
