package projects.parkingLot.service;

import projects.parkingLot.models.ParkingLot;
import projects.parkingLot.models.ParkingSpot;
import projects.parkingLot.models.Ticket;
import projects.parkingLot.models.Vehicle;
import projects.parkingLot.models.enums.ParkingSpotStatus;
import projects.parkingLot.repository.GateRepository;
import projects.parkingLot.repository.ParkingLotRepository;
import projects.parkingLot.repository.ParkingSpotRepository;
import projects.parkingLot.repository.TicketRepository;
import projects.parkingLot.service.strategy.spotAllocationStrategy.SpotAllocationStrategy;
import projects.parkingLot.service.strategy.spotAllocationStrategy.SpotAllocationStrategyFactory;

import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private GateRepository gateRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, GateRepository gateRepository, ParkingSpotRepository parkingSpotRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.gateRepository = gateRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId){
        SpotAllocationStrategy strategy = SpotAllocationStrategyFactory.getSpotAllocationStrategy();
        ParkingLot parkingLot = parkingLotRepository.get(parkingLotId);

        ParkingSpot allocatedSpot = strategy.getSpotForVehicle(parkingLot, vehicle);
        allocatedSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        allocatedSpot.setVehicle(vehicle);
        parkingSpotRepository.put(allocatedSpot);

        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(allocatedSpot);
        ticket.setEntryGate(gateRepository.get(gateId));
        return ticketRepository.put(ticket);
    }
}
