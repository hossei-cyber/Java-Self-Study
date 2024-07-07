package Collectionframework;
import java.util.*;

// Parent class
class Student {
    void print(){
        System.out.println("Student");
    }
}
//Descendant class of Student
class EngStudent extends Student{
    void print(){
        System.out.println("EngStudent");
    }
}
//Descendant class of student
class MgmtStudent extends Student{
    void print(){
        System.out.println("MgmtStudent");
    }
}
class Test{
    // Method to print the student details
    static void printStudent(ArrayList<? extends Student> al){
        // Traversing the list
        for(Student s : al){
            s.print();
        }
    }
    public static void main(String [] args){
        // Creating an array list of EngStudent
        ArrayList<EngStudent> al1 = new ArrayList<>();

        al1.add(new EngStudent());
        al1.add(new EngStudent());

         // Creating an array list of MgmtStudent
        ArrayList<MgmtStudent> al2 = new ArrayList<>();

        al2.add(new MgmtStudent());

        printStudent(al1);
        printStudent(al2);
    }
}
