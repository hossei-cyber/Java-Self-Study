package OOP;

public class chainingFunctions {
    int x, y;
    chainingFunctions(int x, int y){
        this.x = x;
        this.y = y;
    }
    chainingFunctions setx(int x){
        this.x = x;
        return this;
    }
    chainingFunctions sety(int y){
        this.y = y;
        return this;
    }
    void print(){
        System.out.println(x + " " + y);
    }
}
class Driver{
    public static void main(String []args){
        chainingFunctions p1 = new chainingFunctions(10, 20);
        chainingFunctions p2 = new chainingFunctions(5, 15);
        p1.print();
        p2.print();
        p1.setx(2).sety(3);
        p1.print();
    }
}
