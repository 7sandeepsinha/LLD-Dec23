package projects.parkingLot.exception;

public class GateNotFoundException extends RuntimeException{
    public GateNotFoundException() {
    }

    public GateNotFoundException(String message) {
        super(message);
    }
}
