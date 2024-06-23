package OOP;

// Abstract class
abstract class Shape {
    String color;

    // abstract methods
    abstract double area();
    public abstract String toString();

    // Abstract class can have a constructor
    public Shape(String color){
        System.out.println("Shape Constructor called");
        this.color = color;
    }

    //concrete method
    public String getcolor(){
        return color;
    }
}
// Circle inherits from Shape
class Circle extends Shape{
    double radius;
    //constructor
    public Circle(String color, double radius){
        //calling the super constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
    // overriding the area method
    @Override
    double area(){
        return Math.PI * Math.pow(radius, 2);
    }
    //overriding the toString method
    @Override
    public String toString(){
        return "Circle color is " + super.color + " and area is: " + area();
    }

}
//Class Rectangle inherits from Shape
class Rectangle extends Shape{
    double length;
    double width;

    //Constructor for Rectangle
    public Rectangle(String color, double length, double width){
        super(color);
        System.out.println("Rectangle Constructor called");
        this.length = length;
        this.width = width;
    }
    @Override
    double area(){
        return length*width;
    }
    @Override
    public String toString(){
        return "Rectangle color is " + super.color + " and area is: " + area();
    }
}
class test4{
    public static void main(String[]args){
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
