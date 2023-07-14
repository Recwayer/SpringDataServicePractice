package com.example.springdataservicepractice.repositories;

import com.example.springdataservicepractice.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Long> {
    @Override
    Optional<Car> findById(Long id);

    List<Car> findAllByType(String type);

    void deleteById(Long id);
}
