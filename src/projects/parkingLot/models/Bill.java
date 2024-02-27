package projects.parkingLot.models;

import projects.parkingLot.models.enums.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private LocalDateTime exitTime;
    private double amount;
    private BillStatus status;
    private Ticket ticket;
    private Gate exitGate;

    public Bill() {
    }

    public Bill(LocalDateTime exitTime, double amount, BillStatus status, Ticket ticket, Gate exitGate) {
        this.exitTime = exitTime;
        this.amount = amount;
        this.status = status;
        this.ticket = ticket;
        this.exitGate = exitGate;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BillStatus getStatus() {
        return status;
    }

    public void setStatus(BillStatus status) {
        this.status = status;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }
}
