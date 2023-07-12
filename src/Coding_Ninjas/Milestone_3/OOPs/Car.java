package Coding_Ninjas.Milestone_3.OOPs;

class Vehicle {
    String colour;
    private int number;

    Vehicle() {
        System.out.println("Inside Vehicle");
    }

    void set(int number) {
        this.number = number;
    }

    int get() {
        return number;
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("Inside car");
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.colour = "white";
        v.set(1010);
        System.out.println(v.colour + " " + v.get());
    }
}
