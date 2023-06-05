package com.example.parkingLot;

public class ParkingSpot {

    private ParkingState parkingState;
    private VehicleType type;
    private String parkingId;

    public ParkingSpot(String parkingId, VehicleType type) {
        this.parkingId = parkingId;
        this.type = type;
        this.parkingState = ParkingState.AVAILABLE;
    }

    public ParkingState getParkingStateState() {
        return parkingState;
    }

    public void setParkingState(ParkingState state) {
        this.parkingState = state;
    }

    public VehicleType getType() {
        return type;
    }
}
