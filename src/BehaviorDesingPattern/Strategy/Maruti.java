package BehaviorDesingPattern.Strategy;

public class Maruti extends Vehicle{
    String model;
    Maruti(){
        super(new NormalDriveStratergy());
    }
}
