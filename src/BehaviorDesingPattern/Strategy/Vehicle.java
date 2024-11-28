package BehaviorDesingPattern.Strategy;

import BehaviorDesingPattern.Strategy.DriverStratergy.DriveStratergy;

public class Vehicle {
    DriveStratergy driveStratergy;
    Vehicle(DriveStratergy stratergyObj){
        this.driveStratergy = stratergyObj;
    }
    public void drive(){
        driveStratergy.drive();
    }
}
