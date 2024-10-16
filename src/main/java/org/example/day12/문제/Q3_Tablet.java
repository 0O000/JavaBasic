package org.example.day12.문제;

public class Q3_Tablet extends Q3_Laptop { // 태블릿
    private boolean isConnected; // 연결 상태

    public Q3_Tablet(int batteryCapacity, String color, boolean isConnected) {
        super(batteryCapacity, color);
        this.isConnected = isConnected;
    }

    public boolean isConnected() {
        return isConnected;
    }

    @Override
    public String toString() {
        return "Q3_Tablet{" +
                "batteryCapacity=" + getBatteryCapacity() +
                ", color='" + getColor() + '\''+
                ", isConnected=" + isConnected +
                '}';
    }
}