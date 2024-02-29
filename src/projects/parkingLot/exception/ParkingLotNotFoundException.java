package projects.parkingLot.exception;

public class ParkingLotNotFoundException extends RuntimeException{
    public ParkingLotNotFoundException() {
    }

    public ParkingLotNotFoundException(String message) {
        super(message);
    }
}
