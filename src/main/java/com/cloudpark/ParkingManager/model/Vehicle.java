package com.cloudpark.ParkingManager.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@DynamicUpdate
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String plate;
    private String model;
    private String description;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
