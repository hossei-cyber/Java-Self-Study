package Advance;
public class ExceptDemo
{
    int a, b, Min;

    ExceptDemo(){};

    ExceptDemo(int x,int y)
    {
        this.a = x;
        this.b = y;
        this.Min = Integer.MAX_VALUE;
    }
    public void findMin()
    {

        // Add your code here.
        try{
            int addition = a+b;
            if(addition < Min)
                Min = addition;

            int subtraction = a-b;
            if(subtraction < Min)
                Min = subtraction;

            int multiplication = a*b;
            if(multiplication < Min)
                Min = multiplication;

            if (b != 0) {
                int division = a / b;
                if (division < Min) Min = division;
            }else{
                throw new ArithmeticException("Division by zero is not allowed. ");
            }
        }catch(ArithmeticException e){
            System.out.print("An Error occurred: " + e.getMessage());
        }
        System.out.print(Min);

    }
    public static void main(String[] args)
    {
        ExceptDemo obj = new ExceptDemo(10, 0);
        obj.findMin();
    }

}