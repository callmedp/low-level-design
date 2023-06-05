package com.example.parkingLot.service;

import com.example.parkingLot.VehicleType;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ParkingService {

    public long calculatePay(VehicleType type, long duration) {

        long vehicleAddon = type == VehicleType.TWO_WHEELER ? 10: 30;
        if(duration < 2) {

            return 10 + vehicleAddon;
        }
        else if(duration < 8) {

            return 30 + vehicleAddon;
        }
        else if(duration > 8) {
             return 50 + vehicleAddon;
        }

        return 10;
    }

}
