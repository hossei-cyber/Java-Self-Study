package Test;
import java.util.*;
import java.util.Scanner.*;
// Read in n
//Create the set T as the set of all numbers from 2 to n.
//Create the initially empty set S.
// Set p to the value 2.
// Repeat until
// Take all (non-trivial) multiples of p in S.
// If p still has the value 2, set p to 3,
// otherwise increase p by 2 until p is p ̸∈ S.
// until p^2 > n.
// Remove all elements of the set S from the set T .
// Output all elements of the set T (10 values in each line).
public class sieveOfEratosthenes {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        Set<Integer> T = new TreeSet<>();
        for(int i = 2; i <= n; i++){
            T.add(i);
        }
        Set<Integer> S = new TreeSet<>();
        int p = 2;
        while(p*p <= n){ //  until p^2 <= n, do the following
            for(int i = p*p; i <= n; i++){ // i = p^2 to n
                if(i % p == 0){ // i is a multiple of p
                    S.add(i); // add i to S
                }
            }
            if(p == 2){ // if p is 2
                p = 3; // set p to 3
            }
            else{
                p += 2; // else increase p by 2
            }
            while(S.contains(p)){ // while S contains p
                p+= 2; // increase p by 2, why? because we want p ̸∈ S
            }
        }
        T.removeAll(S); // remove all elements of S from T because we want prime numbers
        int count = 0; // count to print 10 values in each line
        for(int x: T){ // for each element x in T
            System.out.print(x + " "); // print x
            count++; // increment count
            if(count % 10 == 0){ // why? to print 10 values in each line for better readability
                System.out.println(); // print a new line after 10 values
            }
        }
        if(count % 10 != 0){
            System.out.println();
        }
    }
}


