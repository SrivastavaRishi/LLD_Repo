package MiscProblems.ParkingLotDesign;

public class ParkingPlace{
    int floor;
    int row;
    int col;
    boolean isOccupied;
    int price;
    VehicleType vehicleType;
    String vehicleNumber;
    ParkingPlace(int floor, int row, int col, int price, VehicleType vh){
        this.floor = floor;
        this.row = row;
        this.col = col;
        this.price = price;
        this.vehicleType = vh;
        this.isOccupied = false;  // Initialize as unoccupied
        this.vehicleNumber = null;  // No vehicle parked initially
    }
    // Park a vehicle
    public void parkVehicle(String vehicleNumber) {
        if (isOccupied) {
            throw new IllegalStateException("Parking is already occupied ... ");
        }
        this.vehicleNumber = vehicleNumber;
        this.isOccupied = true;
        System.out.println("Vehicle parked successfully at Floor: " + floor + ", Row: " + row + ", Col: " + col);
    }

    // Remove a vehicle
    public void removeVehicle() {
        if (!isOccupied) {
            throw new IllegalStateException("Parking place is already empty ... ");
        }
        System.out.println("Vehicle removed: " + vehicleNumber);
        this.vehicleNumber = null;
        this.isOccupied = false;
    }

    // Display parking details
    public void displayDetails() {
        System.out.println("Parking Details: ");
        System.out.println("Floor: " + floor + ", Row: " + row + ", Col: " + col);
        System.out.println("Price: $" + price);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Occupied: " + isOccupied);
        if (isOccupied) {
            System.out.println("Vehicle Number: " + vehicleNumber);
        }
    }
}
