package folderArray;

import java.util.Arrays;

public class lessThan {
    public static void main(String[] args){
        int[] result = lessThanFunc(new int[]{1, 2, 3, 4, 5}, 3);
        System.out.println(Arrays.toString(result));
    }
    public static int[] lessThanFunc(int[] numbers,int k){

        //write your code here
        //return array with elements less than k
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] < k){
                count++;
            }
        }
        int [] result = new int[count];
        int index = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j]< k) {
                result[index++] = numbers[j];  // Store the number and increment the index
            }
        }
        return result;
    }
}
