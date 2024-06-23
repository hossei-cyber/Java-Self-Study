package OOP;
// Superclass
public class Bicycle {
    // 2 Attributes
    public int gear;
    public int speed;
    // Constructor
    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    // 3 methods
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedup(int increment){
        speed += increment;
    }
    public String toString() {
        return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
    }
}
// Subclass
class MountainBike extends Bicycle{
    //one extra attribute
    public int seatHeight;
    // Subclass constructor
    public MountainBike(int gear, int speed, int startHeight){
        // invoking super class's constructor with the keyword super
        super(gear, speed);
        seatHeight = startHeight;
    }
    // Method for the Subclass
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    // Overriding the toString() Method of the superclass
    @Override public String toString(){
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}
class testingagain {
    public static void main (String [] args){
        MountainBike mb = new MountainBike(3, 50, 25);
        System.out.println(mb.toString());
    }
}
