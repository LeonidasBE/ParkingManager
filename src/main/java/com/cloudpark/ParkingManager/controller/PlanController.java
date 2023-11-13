package com.cloudpark.ParkingManager.controller;

import com.cloudpark.ParkingManager.service.PlanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/plan")
public class PlanController {
    private PlanService planService;
}
