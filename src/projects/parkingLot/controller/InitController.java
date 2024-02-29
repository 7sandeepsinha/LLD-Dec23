package projects.parkingLot.controller;

import projects.parkingLot.models.ParkingLot;
import projects.parkingLot.service.InitialisationService;

public class InitController {
    private InitialisationService initialisationService;

    public InitController(InitialisationService initialisationService) {
        this.initialisationService = initialisationService;
    }

    public ParkingLot init(){
        return initialisationService.init();
    }
}
