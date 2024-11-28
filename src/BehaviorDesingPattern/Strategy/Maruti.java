package BehaviorDesingPattern.Strategy;

import BehaviorDesingPattern.Strategy.DriverStratergy.NormalDriveStratergy;

public class Maruti extends Vehicle{
    String model;
    Maruti(){
        super(new NormalDriveStratergy());
    }
}
