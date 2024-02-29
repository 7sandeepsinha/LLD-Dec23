package projects.parkingLot.exception;

public class ParkingFloorNotFoundException extends RuntimeException{
    public ParkingFloorNotFoundException() {
    }

    public ParkingFloorNotFoundException(String message) {
        super(message);
    }
}
