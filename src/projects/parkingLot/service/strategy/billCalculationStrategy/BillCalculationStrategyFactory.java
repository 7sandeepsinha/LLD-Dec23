package projects.parkingLot.service.strategy.billCalculationStrategy;

import projects.parkingLot.models.Ticket;

public class BillCalculationStrategyFactory {
    // TODO : add SurgeBillCalculationStrategy with enum and update here
    public static BillCalculationStrategy getBill(){
        return new SimpleBillCalculationStrategy();
    }
}
