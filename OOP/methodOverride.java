package OOP;
// multilevel inheritance example
class grandMom {
    public String haircolor;
    grandMom(String haircolor){
        this.haircolor= haircolor;
    }
    public String toString(){
        return ("Haircolor: "+ haircolor);
    }
}
// class mom inherits from grandmom
class mom extends grandMom{
    public String eyecolor;
    mom(String haircolor, String eyecolor){
        super(haircolor);
        this.eyecolor = eyecolor;
    }

    @Override
    public String toString() {
        return (super.toString() + "\n" + "Eyecolor: " + eyecolor);
    }
}
// class me inherits from mom and grandmom;
class me extends mom{
    int age;
    me(String haircolor, String eyecolor, int age){
        super(haircolor, eyecolor);
        this.age = age;
    }
    @Override
    public String toString(){
        return (super.toString()+ "\n"+ "Age: "+ age);
    }
}
class show{
    public static void main(String[]args){
        grandMom gmom = new grandMom("brown");
        mom mami = new mom("black", "brown");
        me myself = new me("walnut", "green", 16);
        System.out.println(gmom.toString());
        System.out.println(mami.toString());
        System.out.println(myself.toString());
    }
}
