package projects.parkingLot.repository;

import projects.parkingLot.exception.ParkingLotNotFoundException;
import projects.parkingLot.exception.TicketNotFoundException;
import projects.parkingLot.models.ParkingLot;
import projects.parkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Integer, ParkingLot> parkingLotMap; // table
    private static int idCounter = 0;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot get(int parkingLotId){
        ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
        if(parkingLot == null){
            throw new ParkingLotNotFoundException("ParkingLot not found for id : " + parkingLotId);
        }
        return parkingLot;
    }

    public void put(ParkingLot parkingLot){
        parkingLot.setId(++idCounter);
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        System.out.println("ParkingLot has been added successfully");
    }
}
