import java.util.*;
public class addMethod{
    public static void main(String [] args){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        ListIterator<Integer> it = numbers.listIterator();

        while(it.hasNext()){
            it.add(5);

            it.next();
        }
        System.out.println(numbers);
    }
}