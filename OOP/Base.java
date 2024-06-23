package OOP;

// Polymorphism Method overriding
class Base{
    void fun(){
        System.out.println("Base is fun");
    }
}
class derived2 extends Base{
    @Override
    void fun(){
        System.out.println("Derived is fun");
    }
}
class Test3{
    public static void main (String[] args){
        Base b = new derived2();
        b.fun();
    }
}
