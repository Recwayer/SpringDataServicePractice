package com.example.springdataservicepractice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "trucks")
public class Truck extends Vehicle {
    @Column(name = "load_capacity", nullable = false)
    Double loadCapacity;

    public Truck(String type, String model, BigDecimal price, String fuelType, Double loadCapacity) {
        setType(type);
        setModel(model);
        setPrice(price);
        setFuelType(fuelType);
        setLoadCapacity(loadCapacity);
    }

    protected Truck() {
    }

    public Double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck { id=" + id + ", type=" + type + ", model=" + model + ", price=" + price +
                ", fuelType=" + fuelType + ", loadCapacity=" + loadCapacity + " }";
    }
}
