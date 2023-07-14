package com.example.springdataservicepractice.services.impl;

import com.example.springdataservicepractice.models.Car;
import com.example.springdataservicepractice.repositories.CarRepository;
import com.example.springdataservicepractice.repositories.VehicleRepository;
import com.example.springdataservicepractice.services.CarService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService<Long> {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Car findCar(Long id) {
        return carRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString()));
    }

    @Override
    public List<Car> findCarsByVehicle(String type) {
        return carRepository.findAllByType(type);
    }

    @Override
    public void register(Car car) {
        carRepository.save(car);
    }

    @Override
    public void delete(Long id) {
        carRepository.deleteById(id);

    }

    @Override
    public void save(Car car) {
        carRepository.save(car);
    }
}
