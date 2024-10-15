package org.example.day11.스태틱static;

import java.util.Scanner;

public class Q5_DrinkApplication {
    private static Q5_Drink[] drinks = {
            new Q5_Drink("콜라", 1200, 10),
            new Q5_Drink("사이다", 1100, 10),
            new Q5_Drink("커피", 900, 10)
    };
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            menuPrint();
            int menu = sc.nextInt();
            if (menu == 1) {
                drinkList();
            }
            if (menu == 2) {
                drinkList();
                drinkBuy();
            }
            if (menu == 3) {
                flag = false;
            }
        }
    }

    public static void menuPrint() {
        System.out.println("자판기 메뉴");
        System.out.println("1. 음료 보기");
        System.out.println("2. 음료 구매");
        System.out.println("3. 종료");
        System.out.print("선택: ");
    }

    public static void drinkList() {
        int i = 1;
        for (Q5_Drink drink : drinks) {
            System.out.println(i + ". " + drink);
            i++;
        }
    }

    public static void drinkBuy() {
        System.out.print("구매할 음료 번호를 선택하세요: ");
        int buyNum = sc.nextInt();
        System.out.println(drinks[buyNum - 1].getName() + "를 구매했습니다.");
        drinks[buyNum - 1].minusCount();
    }
}
