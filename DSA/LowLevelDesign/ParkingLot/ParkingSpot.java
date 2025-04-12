package LowLevelDesign.ParkingLot;

public class ParkingSpot {

    private int spotId;
    private boolean isAvailable;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotId) {
        this.spotId = spotId;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.isAvailable = false;
    }

    public void removeVehicle() {
        this.parkedVehicle = null;
        this.isAvailable = false;
    }
}
