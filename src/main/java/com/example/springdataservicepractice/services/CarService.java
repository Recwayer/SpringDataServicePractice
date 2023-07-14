package com.example.springdataservicepractice.services;

import com.example.springdataservicepractice.models.Car;

import java.util.List;

public interface CarService<ID> {
    Car findCar(ID id);

    List<Car> findCarsByVehicle(String type);

    void register(Car car);

    void delete(ID id);

    void save(Car car);
}
