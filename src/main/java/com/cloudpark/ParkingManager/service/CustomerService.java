package com.cloudpark.ParkingManager.service;

import com.cloudpark.ParkingManager.model.Customer;
import com.cloudpark.ParkingManager.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public List<Customer> listarTodos() throws Exception {
        try {
            return (List<Customer>) customerRepository.findAll();
        } catch (Exception e) {
            throw e;
        }
    }
}
