import java.util.ArrayList;

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
            arrli.remove(3);
            System.out.println(arrli);

            //print the elemnets one by one
            for(int j = 0; j <= arrli.size(); j++){
                System.out.println(arrli.get(j) + " ");
            }


        }
    }
}