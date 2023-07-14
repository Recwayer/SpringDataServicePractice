package com.example.springdataservicepractice;

import com.example.springdataservicepractice.models.Bike;
import com.example.springdataservicepractice.models.Car;
import com.example.springdataservicepractice.models.Plane;
import com.example.springdataservicepractice.repositories.BikeRepository;
import com.example.springdataservicepractice.repositories.CarRepository;
import com.example.springdataservicepractice.repositories.PlaneRepository;
import com.example.springdataservicepractice.repositories.VehicleRepository;
import com.example.springdataservicepractice.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Autowired
    CarService carService;
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private VehicleRepository vehicleRepository;


    @Override
    public void run(String... args) throws Exception {
        seedData();

        printAllCar();
        printAllVehicle();
    }

    private void printAllCar() {
        carRepository
                .findAll()
                .forEach(System.out::println);
    }

    private void printAllVehicle() {
        vehicleRepository
                .findAll()
                .forEach(System.out::println);
    }

    private void seedData() throws IOException {
        Car c1 = new Car("Car", "BMW", BigDecimal.valueOf(6513.5), "92", 5);
        Car c2 = new Car("Car", "Mazda", BigDecimal.valueOf(654.2), "95", 7);
        carService.register(c1);
        carService.register(c2);
        c1.setPrice(BigDecimal.valueOf(667.1));
        carService.save(c1);
        System.out.println(carService.findCar((long) 1));
        carService.findCarsByVehicle("Car").forEach(System.out::println);
        carService.delete(c2.getId());
    }
}
