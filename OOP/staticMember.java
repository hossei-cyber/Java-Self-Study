package OOP;
class staticMember {
    String name;
    int id;
    static int playerCount = 0;
    staticMember(String name){
        this.name = name;
        id = ++playerCount;
    }
    void printDetails(){
        System.out.println(id + " :" + name);
    }
}
class testagain{
    public static void main(String[]args){
        staticMember p1 = new staticMember("Hossay");
        staticMember p2 = new staticMember("Zala");
        staticMember p3 = new staticMember("Hafsa");
        p1.printDetails();
        p2.printDetails();
        p3.printDetails();
        System.out.println(staticMember.playerCount);

    }
}
