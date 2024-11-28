package BehaviorDesingPattern.Strategy;

import BehaviorDesingPattern.Strategy.DriverStratergy.SportsDriveStratergy;

public class FerrariCar extends Vehicle{
    String model;
    FerrariCar(){
        super(new SportsDriveStratergy());
    }
}
