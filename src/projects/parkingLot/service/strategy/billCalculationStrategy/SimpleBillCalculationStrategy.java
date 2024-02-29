package projects.parkingLot.service.strategy.billCalculationStrategy;

import projects.parkingLot.models.Bill;
import projects.parkingLot.models.Ticket;
import projects.parkingLot.models.enums.BillStatus;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SimpleBillCalculationStrategy implements BillCalculationStrategy{
    //1 sec is 1 Rs.
    //TODO update the method to pass gate as well and update
    @Override
    public Bill generateBill(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        long numberOfSeconds = ChronoUnit.SECONDS.between(exitTime, entryTime);
        long amount = numberOfSeconds;
        Bill bill = new Bill();
        bill.setAmount(amount);
        bill.setTicket(ticket);
        bill.setExitTime(exitTime);
        bill.setId(exitTime.hashCode());
        bill.setStatus(BillStatus.UNPAID);
        return bill;
    }
}
