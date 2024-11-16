package BehaviorDesingPattern.Strategy;

public class FerrariCar extends Vehicle{
    String model;
    FerrariCar(){
        super(new SportsDriveStratergy());
    }
}
