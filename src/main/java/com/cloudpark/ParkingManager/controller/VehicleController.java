package com.cloudpark.ParkingManager.controller;

import com.cloudpark.ParkingManager.service.VehicleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/vehicle")
public class VehicleController {
    private VehicleService vehicleService;
}
