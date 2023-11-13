package com.cloudpark.ParkingManager.repository;

import com.cloudpark.ParkingManager.model.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
    Optional<Vehicle> findByPlate(String plate);
}
