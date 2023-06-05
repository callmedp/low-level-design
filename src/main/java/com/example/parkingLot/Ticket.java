package com.example.parkingLot;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ticket {

    private Vehicle vehicle;
    private LocalDateTime checkin;
    private LocalDateTime checkout;
    private ParkingSpot assignedSpot;

    public Ticket(Vehicle vehicle, LocalDateTime checkin, ParkingSpot assignedSpot) {
        this.vehicle = vehicle;
        this.checkin = checkin;
        this.assignedSpot = assignedSpot;
    }

    public ParkingSpot getAssignedSpot() {
        return assignedSpot;
    }

    public void setCheckout(LocalDateTime checkout) {

        this.checkout = checkout;
    }

    public LocalDateTime getCheckin() {
        return checkin;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
