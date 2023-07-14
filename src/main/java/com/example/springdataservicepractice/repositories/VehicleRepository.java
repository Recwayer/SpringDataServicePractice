package com.example.springdataservicepractice.repositories;

import com.example.springdataservicepractice.models.Car;
import com.example.springdataservicepractice.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findAllByType(String type);
}
