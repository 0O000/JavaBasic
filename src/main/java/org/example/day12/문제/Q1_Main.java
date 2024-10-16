package org.example.day12.문제;

public class Q1_Main {
    public static void main(String[] args) {
        Q1_Car c1 = new Q1_Car("Audi", "A8", 4);
        Q1_Bike b1 = new Q1_Bike("YAMAHA", "Tracer 9", true);
        System.out.println(c1.display());
        System.out.println(b1.display());
    }
}
