package com.cloudpark.ParkingManager.controller;

import com.cloudpark.ParkingManager.service.ContractRuleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/contractrule")
public class ContractRuleController {
    private ContractRuleService contractRuleService;

}
