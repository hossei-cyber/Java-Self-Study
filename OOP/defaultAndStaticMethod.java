package OOP;
// Interface to show default and static method
interface MyInt {
    default void fun1(){
        System.out.println("fun1()");
    }
    static void fun2(){
        System.out.println("fun2()");
    }
    //abstract by default
    void fun3();
}
class yourInt implements MyInt{
    public void fun3(){
        System.out.println("fun3()");
    }
    public static void main (String[] args){
        yourInt t = new yourInt();
        t.fun1();
        MyInt.fun2();;//to call the static method i need to use the interface name
        t.fun3();
    }
}
