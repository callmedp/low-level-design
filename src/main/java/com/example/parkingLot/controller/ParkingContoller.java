package com.example.parkingLot.controller;

import com.example.parkingLot.*;
import com.example.parkingLot.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Optional;

@Controller
public class ParkingContoller {

    private ParkingSpot park1;
    private ParkingSpot park2;
    private ParkingSpot park3;
    private ParkingLot parkingLot;
    private Ticket ticket1;
    private Vehicle vehicle1;

    @Autowired
    ParkingService parkingService;

    public void spawnParking() {

        park1 = new ParkingSpot("L1", VehicleType.TWO_WHEELER);
        park2 = new ParkingSpot("L2", VehicleType.FOUR_WHEELER);
        park3 = new ParkingSpot("L3", VehicleType.FOUR_WHEELER);

        parkingLot = new ParkingLot(Arrays.asList(park1, park2, park3));
    }

    public void generateTicket() {

        vehicle1 = new Vehicle(VehicleType.FOUR_WHEELER, "UP32100");

        Optional<ParkingSpot> spot = parkingLot.getAvailableParkingSpot(vehicle1);

        if (spot.isPresent()) {

            spot.get().setParkingState(ParkingState.OCCUPIED);
            ticket1 = new Ticket(vehicle1, LocalDateTime.now(), spot.get());
        }
        else {

            System.out.println("Cannot assign parking spot, parking is full");
        }
    }

    public void payment() {

        ticket1.setCheckout(LocalDateTime.now());
        long parkingDuration = Duration.between(ticket1.getCheckin(), ticket1.getCheckout()).toHours();
        long cost = parkingService.calculatePay(ticket1.getVehicle().getType(), parkingDuration);
        System.out.println("the cost of parking is " + cost);
        ticket1.getAssignedSpot().setParkingState(ParkingState.AVAILABLE);

    }
}
