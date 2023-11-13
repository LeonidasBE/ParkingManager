package com.cloudpark.ParkingManager.controller;

import com.cloudpark.ParkingManager.service.ContractService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/contract")
public class ContractController {
    private ContractService contractService;

}
