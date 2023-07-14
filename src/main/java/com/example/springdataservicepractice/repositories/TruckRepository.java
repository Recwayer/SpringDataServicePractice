package com.example.springdataservicepractice.repositories;

import com.example.springdataservicepractice.models.Truck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckRepository extends JpaRepository<Truck, Long> {
}
