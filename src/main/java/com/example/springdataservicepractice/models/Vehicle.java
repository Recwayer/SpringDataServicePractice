package com.example.springdataservicepractice.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Vehicle")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicle {
    @Id
    @GeneratedValue
    @Column(name = "id")
    protected Long id;
    @Column(name = "type", nullable = false)
    protected String type;
    @Column(name = "model", nullable = false)
    protected String model;
    @Column(name = "price", nullable = false)
    protected BigDecimal price;
    @Column(name = "fuel_type", nullable = false)
    protected String fuelType;

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getFuelType() {
        return fuelType;
    }

    protected void setId(Long id) {
        this.id = id;
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

}
