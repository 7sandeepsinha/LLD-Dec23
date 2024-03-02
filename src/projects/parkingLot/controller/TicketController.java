package projects.parkingLot.controller;

import projects.parkingLot.exception.InvalidRequestException;
import projects.parkingLot.models.Ticket;
import projects.parkingLot.models.Vehicle;
import projects.parkingLot.service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId){
        if(gateId <= 0 || parkingLotId <= 0){
            throw new InvalidRequestException("Please enter valid request");
        }
        return ticketService.generateTicket(vehicle, gateId, parkingLotId);
    }
}
