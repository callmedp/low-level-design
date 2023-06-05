package com.example.parkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingLot {

    private List<ParkingSpot> parkingSpots = new ArrayList();

    public ParkingLot(List parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public Optional<ParkingSpot> getAvailableParkingSpot(Vehicle vehicle) {

        return parkingSpots.stream().filter(spot -> spot.getType() == vehicle.getType() && spot.getParkingStateState() == ParkingState.AVAILABLE).findFirst();
    }

}
