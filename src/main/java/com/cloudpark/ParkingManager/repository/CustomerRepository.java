package com.cloudpark.ParkingManager.repository;

import com.cloudpark.ParkingManager.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
