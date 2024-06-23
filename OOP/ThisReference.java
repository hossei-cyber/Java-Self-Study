package OOP;

public class ThisReference {
    int x, y;

    ThisReference(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println(x + " " + y);
    }
}
class Test1{
    public static void main(String []args){
        ThisReference p1 = new ThisReference(10, 20);
        ThisReference p2  = new ThisReference(5, 15);
        p1.print();
        p2.print();
    }
}

