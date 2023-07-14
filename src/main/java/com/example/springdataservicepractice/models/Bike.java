package com.example.springdataservicepractice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "bikes")
public class Bike extends Vehicle {


    public Bike(String type, String model, BigDecimal price, String fuelType) {
        setType(type);
        setModel(model);
        setPrice(price);
        setFuelType(fuelType);
    }

    protected Bike() {
    }

    @Override
    public String toString() {
        return "Bike { id=" + id + ", type=" + type + ", model=" + model + ", price=" + price +
                ", fuelType=" + fuelType + " }";
    }
}
