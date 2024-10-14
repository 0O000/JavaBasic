package org.example.day10.생성자;

public class Car사용 {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Benz";
        car.color = "white";
        car.maxSpeed = 200;
        System.out.println(car.model + " " + car.color + " " + car.maxSpeed);
        car.speedUp();

        Car car2 = new Car();
        car2.model = "Audi";
        car2.color = "red";
        car2.maxSpeed = 180;
        System.out.println(car2.model + " " + car2.color + " " + car2.maxSpeed);
        car.speedUp();
    }
}
