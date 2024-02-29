package projects.parkingLot.service.strategy.spotAllocationStrategy;

import projects.parkingLot.exception.ParkingSpotNotFoundForVehicleException;
import projects.parkingLot.models.ParkingFloor;
import projects.parkingLot.models.ParkingLot;
import projects.parkingLot.models.ParkingSpot;
import projects.parkingLot.models.Vehicle;
import projects.parkingLot.models.enums.ParkingSpotStatus;

import java.util.List;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy{
    @Override
    public ParkingSpot getSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle) {
        List<ParkingFloor> parkingFloors = parkingLot.getFloors();
        //TODO : add the required validations
        for(ParkingFloor parkingFloor : parkingFloors){
            for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots()){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) &&
                    parkingSpot.getVehicleType().equals(vehicle.getVehicleType())
                ){
                    return parkingSpot;
                }
            }
        }
       throw new ParkingSpotNotFoundForVehicleException("Please go home, eat and sleep");
    }
}
