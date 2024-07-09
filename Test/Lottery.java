package Test;
import java.util.*;

// generate random numbers from 1 to 49
// store unique numbers in a set
// repeat until set contains 7 numbers including the bonus number
// print the numbers
public class Lottery {
    public static void main(String [] args){
        Set<Integer> myLottery = new HashSet<>(); // why HashSet? because we want unique numbers
        Random rand = new Random(); // why Random? because we want random numbers
        while(myLottery.size() < 7){// why 7? because we want 6 numbers and a bonus number
            int number = rand.nextInt(49)+1; // rand.nextInt does not include 49, so we add 1
            myLottery.add(number);
        }
        System.out.println("Lottery numbers are: " + myLottery);
    }
}
