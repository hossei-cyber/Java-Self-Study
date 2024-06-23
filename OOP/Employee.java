package OOP;

public class Employee {
    int id;
    int salary;
    Employee(int i, int s){
        id = i;
        salary = s;
    }
}
class SalesEmp extends Employee{
    int salesInc;
    SalesEmp(int i, int s, int si){
        super(i, s);
        salesInc = si;
    }
}
class Test2{
    public static void main (String [] args){
        SalesEmp se = new SalesEmp(100, 1000, 10000);
        System.out.println("Id: " + se.id);
        System.out.println("Salary: " + se.salary);
        System.out.println("Salesinc: " + se. salesInc);
    }

}
