package BehaviorDesingPattern.Strategy.DriverStratergy;

public class NormalDriveStratergy implements DriveStratergy {
    @Override
    public void drive() {
        System.out.println("normal driving car");
    }
}
