package org.example.day9.UML문제;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item burger = new Item();
        Item fries = new Item();
        Item soda = new Item();

        burger.name = "Burger";
        fries.name = "Fries";
        soda.name = "Soda";

        burger.price = 5.99;
        fries.price = 2.99;
        soda.price = 1.99;

        Item[] items = {burger, fries, soda};

        System.out.println("주문 가능한 메뉴입니다.");
        System.out.println("===================");
        for (int j = 0; j < items.length; j++) {
            System.out.println(j + 1 + ">> " + items[j].getName() + ": $" + items[j].getPrice());
        }
        System.out.print("메뉴 번호를 입력, 3개 모두 주문 완료 되었으면 'x'입력 >> ");
        String input = sc.nextLine();
        String[] inputString = input.split(" ");
        System.out.println("주문 내용입니다: ");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[Integer.parseInt(inputString[i]) - 1].getName()
                    + ": " + items[Integer.parseInt(inputString[i]) - 1].getPrice());
        }
        sc.close();
    }
}