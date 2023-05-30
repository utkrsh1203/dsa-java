package Coding_Ninjas.Milestone_3.OOPs.Interface;

public class Car extends Vehicle implements VehicleInterface, CarInterface {
    public boolean isMotorised() {
        return true;
    }

    public String getCompany() {
        return "";
    }

    public int numGears() {
        return 5;
    }
}
