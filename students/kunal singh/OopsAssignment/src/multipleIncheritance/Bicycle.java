package multipleIncheritance;

//Base Class
public class Bicycle {
    //Bicycle has two fields
    public int gear;
    public int speed;

    //Creating constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // bicycle has 3 methods
    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    //toString() method to print info of Bicycle
    public String toString() {
        return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);

    }
}
