package com.example.springdataservicepractice.repositories;

import com.example.springdataservicepractice.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BikeRepository extends JpaRepository<Bike, Long> {
    Optional<Bike> findById(Long id);
}
