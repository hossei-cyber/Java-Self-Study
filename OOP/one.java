package OOP;
//Multilevel Inheritance
interface one {
    public void print_Geek();
}
interface two{
    public void print_for();
}
interface three extends one, two{
    public void print_Geek();
}
class child implements three{
    @Override public void print_Geek(){
        System.out.println("Geeks");
    }

    @Override
    public void print_for() {
        System.out.println("for");
    }
}
class main{
    public static void main(String[] args){
        child c = new child();
        c.print_Geek();
        c.print_for();
        c.print_Geek();
    }
}
