package com.example.parkingLot;

public class Vehicle {

    private VehicleType type; // 2 wheeler or 4 wheeler
    private String id; // vehicle number

    public Vehicle(VehicleType type, String id) {
        this.type = type;
        this.id = id;
    }

    public VehicleType getType() {
        return type;
    }

    public String getId() {
        return id;
    }
}
