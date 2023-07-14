package com.example.springdataservicepractice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "planes")
public class Plane extends Vehicle {
    @Column(name = "passengerCapacity", nullable = false)
    Integer passengerCapacity;

    public Plane(String type, String model, BigDecimal price, String fuelType, Integer passengerCapacity) {
        setType(type);
        setModel(model);
        setPrice(price);
        setFuelType(fuelType);
        setPassengerCapacity(passengerCapacity);
    }

    protected Plane() {
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Plane { id=" + id + ", type=" + type + ", model=" + model + ", price=" + price +
                ", fuelType=" + fuelType + ", passengerCapacity=" + passengerCapacity + " }";
    }
}
