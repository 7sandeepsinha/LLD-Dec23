package projects.parkingLot.service;

import projects.parkingLot.models.Gate;
import projects.parkingLot.models.ParkingFloor;
import projects.parkingLot.models.ParkingLot;
import projects.parkingLot.models.ParkingSpot;
import projects.parkingLot.models.enums.*;
import projects.parkingLot.repository.GateRepository;
import projects.parkingLot.repository.ParkingFloorRepository;
import projects.parkingLot.repository.ParkingLotRepository;
import projects.parkingLot.repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {

    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public InitialisationService(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository) {
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public ParkingLot init(){
        System.out.println("****Starting Initialisation****");

        //Creating a parking Lot object
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Radhe Parking Center");
        parkingLot.setAddress("Somewhere inside a costly mall");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);
        parkingLot.setVehicleTypesSupported(List.of(VehicleType.TWO_WHEELER, VehicleType.FOUR_WHEELER));

        List<ParkingFloor> floors = new ArrayList<>();
        //Running a loop to create 10 parking floor object
        for(int i=1;i<=10;i++){
            // Creating parkingFloor object
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(i);
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);
            List<ParkingSpot> spots = new ArrayList<>();
            //for each floor creating 10 parking spot objects
            for(int j=1;j<=10;j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(j);
                parkingSpot.setNumber((i * 100)+ j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }
            parkingFloor.setParkingSpots(spots);
            //creating entry gate object
            Gate entryGate = new Gate();
            entryGate.setId((i*1000) + 1);
            entryGate.setGateNumber(i*100 + 1);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperatorName("Operator : " + i + 1);
            parkingFloor.setEntryGate(entryGate);
            gateRepository.put(entryGate);

            //creating exit gate object
            Gate exitGate = new Gate();
            exitGate.setId((i*1000) + 2);
            exitGate.setGateNumber(i*100 + 2);
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setOperatorName("Operator : " + i + 2);
            parkingFloor.setExitGate(exitGate);
            gateRepository.put(exitGate);

            floors.add(parkingFloor); // adding the floor to floor list
            parkingFloorRepository.put(parkingFloor); // saving the floor to repository
        }
        parkingLot.setFloors(floors);  // adding floor list to parking lot
        parkingLotRepository.put(parkingLot);
        return parkingLotRepository.get(1);
    }
}
