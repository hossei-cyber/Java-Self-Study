package OOP;

public class Complex {
    int real, imaginary;
    void print(){
        System.out.println(real+" + i"+imaginary);
    }
    //Constructor, has the same name as the class
    Complex(int r, int i){
        real = r;
        imaginary = i;
    }
    void add(Complex c){
        real += c.real;
        imaginary += c.imaginary;
    }
}
class Test{
    public static void main(String []args){
        Complex c1 = new Complex(10, 20);
        c1.print();
        Complex c2 = new Complex(20, 30);
        c2.print();
        c1.add(c2);
        c1.print();
    }
}
