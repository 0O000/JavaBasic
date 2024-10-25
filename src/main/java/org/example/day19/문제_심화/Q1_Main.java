package org.example.day19.문제_심화;

public class Q1_Main {
    public static void main(String[] args) {
        Q1_DatabaseConnection data = Q1_DatabaseConnection.getInstance();
        Q1_DatabaseConnection data2 = Q1_DatabaseConnection.getInstance();
        Q1_DatabaseConnection data3 = Q1_DatabaseConnection.getInstance();
        System.out.println(data.hashCode());
        System.out.println(data2.hashCode());
        System.out.println(data3.hashCode());
    }
}