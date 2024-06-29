package OOP;
// Interface
interface Vehicle {
    // all are the abstract methods
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle2 implements Vehicle{
    int speed;
    int gear;

    //to change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    //to increase the speed
    @Override
    public void speedUp(int increment){
        speed += increment;
    }

    //to decrease speed
    public void applyBrakes(int decrement){
        speed -= decrement;
    }

    public void printStates(){
        System.out.println("Speed " + speed + " gear: " + gear);
    }
}
class Bike implements Vehicle{
    int speed;
    int gear;

    //to change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    //to increase the speed
    @Override
    public void speedUp(int increment){
        speed += increment;
    }

    //to decrease speed
    public void applyBrakes(int decrement){
        speed -= decrement;
    }

    public void printStates(){
        System.out.println("Speed " + speed + " gear: " + gear);
    }
}
class driver4{
    public static void main(String[]args){
        //instantiating Bicycle2
        Bicycle2 bicycle2 = new Bicycle2();
        bicycle2.changeGear(2);
        bicycle2.speedUp(3);
        bicycle2.applyBrakes(1);

        System.out.println("Bicycle present state: ");
        bicycle2.printStates();

        //instantiating Bike
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state: ");
        bike.printStates();
    }
}
