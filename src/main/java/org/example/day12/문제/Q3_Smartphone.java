package org.example.day12.문제;

public class Q3_Smartphone extends Q3_Laptop {
    private int cameraResolution; // 카메라 해상도

    public Q3_Smartphone(int batteryCapacity, String color, int cameraResolution) {
        super(batteryCapacity, color);
        this.cameraResolution = cameraResolution;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    @Override
    public String toString() {
        return "Q3_Smartphone{" +
                "batteryCapacity=" + getBatteryCapacity() +
                ", color='" + getColor() + '\''+
                ", cameraResolution=" + cameraResolution +
                '}';
    }
}