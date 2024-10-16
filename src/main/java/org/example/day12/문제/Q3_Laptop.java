package org.example.day12.문제;

public class Q3_Laptop { // 노트북
    private int batteryCapacity; // 배터리 용량
    private String color; // 색상

    public Q3_Laptop(int batteryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Q3_Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
