package projects.parkingLot.service.strategy.spotAllocationStrategy;

import projects.parkingLot.models.ParkingSpot;
import projects.parkingLot.models.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot getSpotForVehicle(Vehicle vehicle);
}
