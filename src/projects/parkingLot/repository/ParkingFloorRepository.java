package projects.parkingLot.repository;

import projects.parkingLot.exception.ParkingFloorNotFoundException;
import projects.parkingLot.exception.ParkingLotNotFoundException;
import projects.parkingLot.models.ParkingFloor;
import projects.parkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
    private Map<Integer, ParkingFloor> parkingFloorMap; // table

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor get(int parkingFloorId){
        ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
        if(parkingFloor == null){
            throw new ParkingFloorNotFoundException("ParkingFloor not found for id : " + parkingFloorId);
        }
        return parkingFloor;
    }

    public void put(ParkingFloor parkingFloor){
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("parkingFloor has been added successfully");
    }
}
