class Distinct{

public static void main(String[] args){
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(5);

    System.out.println(countDistinct(numbers));
}

    public static int countDistinct(ArrayList<Integer> numbers){
    
    int count = 0;
    
        for(int i = 0; i < numbers.size(); i++){
            boolean isDistinct = true;
            for(int j = 0; j < i; j++){
                if(numbers.get(i) == numbers.get(j)){
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct){
            count++;
            }
        }
        return count;
    }
}