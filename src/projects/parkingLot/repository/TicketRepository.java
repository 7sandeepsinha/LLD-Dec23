package projects.parkingLot.repository;

import projects.parkingLot.exception.TicketNotFoundException;
import projects.parkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Integer, Ticket> ticketMap; // table

    public TicketRepository() {
        this.ticketMap = new HashMap<>();
    }

    public Ticket get(int ticketId){
        Ticket ticket = ticketMap.get(ticketId);
        if(ticket == null){
            throw new TicketNotFoundException("Ticket not found for id : " + ticketId);
        }
        return ticket;
    }

    public void put(Ticket ticket){
        ticketMap.put(ticket.getId(), ticket);
        System.out.println("Ticket has been added successfully");
    }
}
