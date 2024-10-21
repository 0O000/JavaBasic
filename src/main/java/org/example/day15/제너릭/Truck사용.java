package org.example.day15.제너릭;

public class Truck사용 {
    public static void main(String[] args) {
        Truck<String, Integer> truck1 = new Truck<>();
        truck1.무게 = "중량무게";
        truck1.거리 = 500;
        System.out.println(truck1);

        Truck<Double, String> truck2 = new Truck<>();
        truck2.무게 = 200.0;
        truck2.거리 = "장거리";
        System.out.println(truck2);
    }
}
