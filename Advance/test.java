package Advance;
import java.math.BigInteger;
import java.io.*;
import java.util.*;

class test implements Runnable{
    int value;

    public static void main(String[] args)
    {
        Thread ob[] = new Thread[10];

        for(int i = 0; i < ob.length; ++i){
            test object = new test();
            object.value = i;

            ob[i] = new Thread(object);
        }
    }
    @Override
    public void run(){
        System.out.println("Starting Thread" + value);
    }
    public void start()
    {
        System.out.println("Starting Thread" + value);
    }

}
