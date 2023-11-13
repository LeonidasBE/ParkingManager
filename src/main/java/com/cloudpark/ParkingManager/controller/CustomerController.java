package com.cloudpark.ParkingManager.controller;

import com.cloudpark.ParkingManager.model.Customer;
import com.cloudpark.ParkingManager.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private CustomerService customerService;

    @GetMapping(name = "/listar-todos")
    public ResponseEntity<List<Customer>> listarTodos() {
        try {
            return ResponseEntity.ok(customerService.listarTodos());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

}
