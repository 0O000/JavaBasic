package org.example.day12.문제;

public class Q3_Main {
    public static void main(String[] args) {
        Q3_Tablet t1 = new Q3_Tablet(70, "blue", false);
        Q3_Smartphone s1 = new Q3_Smartphone(80, "red", 20);
        Q3_Laptop l1 = new Q3_Laptop(70, "silver");

        System.out.println(t1);
        System.out.println(s1);
        System.out.println(l1);
    }
}