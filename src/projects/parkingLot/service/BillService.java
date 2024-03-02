package projects.parkingLot.service;

import projects.parkingLot.models.Bill;
import projects.parkingLot.service.strategy.billCalculationStrategy.BillCalculationStrategy;
import projects.parkingLot.service.strategy.billCalculationStrategy.BillCalculationStrategyFactory;

public class BillService {
    public Bill generateBill(int ticketId, int exitGateId) {
        BillCalculationStrategy billCalculationStrategy = BillCalculationStrategyFactory.getBill();
        // fetch ticket object from repository
        //double amount = billCalculationStrategy.generateBill(ticket);
        Bill bill = new Bill();
        // add all details required to bill
        // release the spot -> spot details are present inside ticket object
        return bill;

    }
}
