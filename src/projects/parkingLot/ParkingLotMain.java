package projects.parkingLot;

import projects.parkingLot.controller.InitController;
import projects.parkingLot.models.ParkingLot;
import projects.parkingLot.repository.GateRepository;
import projects.parkingLot.repository.ParkingFloorRepository;
import projects.parkingLot.repository.ParkingLotRepository;
import projects.parkingLot.repository.ParkingSpotRepository;
import projects.parkingLot.service.InitialisationService;

public class ParkingLotMain {

    public static void main(String[] args) {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        GateRepository gateRepository = new GateRepository();

        InitialisationService initialisationService = new InitialisationService(
                gateRepository,
                parkingLotRepository,
                parkingFloorRepository,
                parkingSpotRepository
        );

        InitController initController = new InitController(initialisationService);

        ParkingLot parkingLot = initController.init();
        System.out.println("END");
    }
}
