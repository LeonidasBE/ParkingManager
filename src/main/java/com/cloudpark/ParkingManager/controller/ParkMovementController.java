package com.cloudpark.ParkingManager.controller;

import com.cloudpark.ParkingManager.service.ParkMovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/parkmovement")
public class ParkMovementController {
    private ParkMovementService parkMovementService;

}
