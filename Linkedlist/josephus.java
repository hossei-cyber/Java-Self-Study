package Linkedlist;
import java.util.*;

class josephus {

    static int josephusExample(int N, int K)
    {
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements numbered from 0 to N-1
        // in LinkedList
        for(int i=0; i<N; i++)
            list.add(i);

        Iterator<Integer> it = list.iterator();

        // Run this loop until there is only
        // one element left in the list
        while(list.size()>1)
        {
            int count = 1;

            // Find Kth element
            while(count< K)
            {
                while(it.hasNext() && count <= K)
                {
                    it.next();
                    count++;
                }

                // If this is true, it means we have reached
                // end of list and count is less than k
                // So, we will move iterator from end to first
                // and increment count
                if(count < K)
                {
                    it = list.iterator();
                    it.next();
                    count++;
                }

                // Remove the Kth element
                it.remove();
            }
        }

        // Return the first element which is the only
        // element left
        return list.getFirst();
    }

    public static void main (String[] args) {

        int N = 7, K = 3;

        System.out.println(josephusExample(N, K));

    }
}
