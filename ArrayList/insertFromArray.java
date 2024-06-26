class insertFromArray{
    public static ArrayList<Integer> fillArrayList(int arr[], int n)
    {
    //Your code here
    //declaring my arraylist 
        ArrayList<Integer> al = new ArrayList<Integer>();
    
    //extracting elements of array
        for(int i = 0; i < arr.length; i++){
            al.add(arr[i]);
        }
        return al;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integers> result = fillArrayList(arr, arr.length);

        SYstem.out.println("ArrayList filled from Array:")
        for(int num : result){
            System.out.println(num + " ");
        }
    }
}