package com.cloudpark.ParkingManager.controller;

import com.cloudpark.ParkingManager.service.CustomerPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customerplan")
public class CustomerPlanController {
    private CustomerPlanService customerPlanService;

}
