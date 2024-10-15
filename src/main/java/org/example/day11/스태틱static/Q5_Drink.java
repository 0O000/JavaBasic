package org.example.day11.스태틱static;

public class Q5_Drink {
    String name;
    int cost;
    int count;

    public Q5_Drink(String name, int cost, int count) {
        this.name = name;
        this.cost = cost;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void minusCount(){
        count--;
    }

    @Override
    public String toString() {
        return name +
                "(가격: " + cost +
                "원, 재고: " + count +
                "개)";
    }
}
