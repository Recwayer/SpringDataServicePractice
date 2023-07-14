package com.example.springdataservicepractice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "cars")
public class Car extends Vehicle {
    @Column(name = "seats", nullable = false)
    Integer seats;

    public Car(String type, String model, BigDecimal price, String fuelType, Integer seats) {
        setType(type);
        setModel(model);
        setPrice(price);
        setFuelType(fuelType);
        setSeats(seats);
    }

    protected Car() {
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car { id=" + id + ", type=" + type + ", model=" + model + ", price=" + price +
                ", fuelType=" + fuelType + ", seats=" + seats + " }";
    }
}
