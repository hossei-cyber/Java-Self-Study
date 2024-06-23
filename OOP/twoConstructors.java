package OOP;

public class twoConstructors {
    int x, y;
    twoConstructors(int x, int y){
        this.x = x;
        this.y = y;
    }
    twoConstructors(){
        this(10, 10);
    }
    void printing(){
        System.out.println(x + " " + y);
    }
}
class testing{
    public static void main(String [] args){
        twoConstructors chain = new twoConstructors();
        chain.printing();
    }
}
