package org.example.day12.문제;

public class Q1_Vehicle {
    private String brand;
    private String model;

    public Q1_Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String display() {
        return "차량 정보[" +
                "브랜드: " + brand +
                ", 모델: " + model +
                ']';
    }
}
