package Milestone_3.ClassAndObjects.Inheritence;

public abstract class Car extends Vehicle {

    int numDoors;
    int numGears;

    public Car() {
        // super(100);
        System.out.println("Car's Constructor");
        numDoors = 4;
        numGears = 5;
    }

    public Car(int numDoors, int maxSpeed) {
        // super(maxSpeed);
        System.out.println("Car's Constructor");
        this.numDoors = numDoors;
    }

    public void print() {
        super.print();
        System.out.println("Car numDoors " + numDoors + "maxSpeed " + maxSpeed);
    }

    public void printMaxSpeed() {
        maxSpeed = 150;
        System.out.println(maxSpeed + " " + maxSpeed);
    }

    public boolean isMotorised() {
        return true;
    }

}
