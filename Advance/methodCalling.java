package Advance;

import java.io.IOException;

public class methodCalling {
    public void methodA(){
        try{
            methodB();
        } catch(Exception e){
            System.out.println("Exception caught" + e.getMessage());
        }
    }
    public void methodB() throws IOException{
        throw new IOException();
    }
    public static void main(String[] args) {
        methodCalling obj = new methodCalling();
        obj.methodA();
    }
}
