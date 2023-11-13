package com.cloudpark.ParkingManager.repository;

import com.cloudpark.ParkingManager.model.Contract;
import org.springframework.data.repository.CrudRepository;

public interface ContractRepository extends CrudRepository<Contract, Long> {
}
