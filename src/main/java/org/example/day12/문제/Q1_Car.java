package org.example.day12.문제;

public class Q1_Car extends Q1_Vehicle{
    private int numDoors;

    public Q1_Car(String brand, String model, int numDoors) {
        super(brand, model);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public String display() {
        return "차량 정보[" +
                "브랜드: " + getBrand() +
                ", 모델: " + getModel() +
                "도어 수: " + getNumDoors() +
                ']';
    }
}
