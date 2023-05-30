package Coding_Ninjas.Milestone_3.OOPs.Abstract;

public class Vehicle {
    private String color;
    int maxSpeed;

    public Vehicle() {
        System.out.println("Vehicle's Constructor 1");
        maxSpeed = 60;
    }

    public Vehicle(int maxSpeed) {
        System.out.println("Vehicle's Constructor 2");
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.println("Vehicle" + " color " + color);
    }

}
