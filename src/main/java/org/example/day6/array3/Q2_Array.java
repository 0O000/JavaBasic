package org.example.day6.array3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q2_Array {
    public static void main(String[] args) {
        int sum = 0;
        DecimalFormat df = new DecimalFormat("###,###");
        Scanner sc = new Scanner(System.in);
        Object[][] menu = {
                {"샌드위치", 2000},
                {"바게트", 3500}
        };
        int[] order = new int[menu.length];
        int select = 0;
        while(true){
            System.out.println("주문할 상품을 선택하세요 (1: 샌드위치, 2:바게트, 0: 주문종료): ");
            select = sc.nextInt();
            if(select == 0){
                break;
            }
            System.out.println("주문할 수량을 입력하세요: ");
            int num = sc.nextInt();
            order[select - 1] += num;

            System.out.println("현재 주문 상황: ");
            for(int i = 0; i < order.length; i++){
                System.out.print(menu[i][0] + ": " + order[i] + " ");
            }
        }
        System.out.print("현재까지의 총 주문 금액: ");
        for (int i = 0; i < order.length; i++) {
            sum += order[i] * (int) menu[i][1];
        }
        String formatMoney = df.format(sum);
        System.out.println(formatMoney + "원");
    }
}