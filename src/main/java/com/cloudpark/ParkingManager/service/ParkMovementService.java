package com.cloudpark.ParkingManager.service;

import com.cloudpark.ParkingManager.repository.ParkMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkMovementService {
    private ParkMovementRepository parkMovementRepository;
}
