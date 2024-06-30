package Advance;

public class ExceptionHandling {
    public static void main ( String[] args){
        try{
            int[] arr = new int[5];
            arr[10] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
