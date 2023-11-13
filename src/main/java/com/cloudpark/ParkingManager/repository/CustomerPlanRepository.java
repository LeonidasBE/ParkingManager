package com.cloudpark.ParkingManager.repository;

import com.cloudpark.ParkingManager.model.CustomerPlan;
import org.springframework.data.repository.CrudRepository;

public interface CustomerPlanRepository extends CrudRepository<CustomerPlan, Long> {
}
