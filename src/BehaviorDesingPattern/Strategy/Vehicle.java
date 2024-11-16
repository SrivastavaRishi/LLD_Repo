package BehaviorDesingPattern.Strategy;

public class Vehicle {
    DriveStratergy driveStratergy;
    Vehicle(DriveStratergy stratergyObj){
        this.driveStratergy = stratergyObj;
    }
    public void drive(){
        driveStratergy.drive();
    }
}
