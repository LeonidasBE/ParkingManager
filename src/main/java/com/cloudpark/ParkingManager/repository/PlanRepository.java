package com.cloudpark.ParkingManager.repository;

import com.cloudpark.ParkingManager.model.Plan;
import org.springframework.data.repository.CrudRepository;

public interface PlanRepository extends CrudRepository<Plan, Long> {
}
