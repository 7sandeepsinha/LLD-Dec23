package projects.parkingLot.service.strategy.billCalculationStrategy;

import projects.parkingLot.models.Bill;
import projects.parkingLot.models.Ticket;

public interface BillCalculationStrategy {
    Bill generateBill(Ticket ticket);
}
