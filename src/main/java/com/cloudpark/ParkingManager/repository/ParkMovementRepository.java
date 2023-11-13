package com.cloudpark.ParkingManager.repository;

import com.cloudpark.ParkingManager.model.ParkMovement;
import org.springframework.data.repository.CrudRepository;

public interface ParkMovementRepository extends CrudRepository<ParkMovement, Long> {
}
