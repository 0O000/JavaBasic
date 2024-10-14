package org.example.day10.생성자;

import javax.swing.*;
import java.awt.*;

public class Car사용2 {
    public static void main(String[] args) {

        Car2 car = new Car2("Benz", "white", 200);
        System.out.println(car);
        System.out.println(car.model + " " + car.color + " " + car.maxSpeed);
        car.speedUp();

        Car2 car2 = new Car2("Audi", "red", 180);
        System.out.println(car2.model + " " + car2.color + " " + car2.maxSpeed);
        System.out.println(car2);
        car.speedUp();
    }
}
