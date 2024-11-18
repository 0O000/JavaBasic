package org.example.jdbc4.문제.Q1_JDBC;

import java.util.Scanner;

public class Q1_SearchUI {
    public static void main(String[] args) throws Exception {
        Q1_DAO dao = new Q1_DAO();
        Scanner sc = new Scanner(System.in);
        System.out.print("ProductID 입력: ");
        int productId = sc.nextInt();
        Q1_VO bag = dao.search(productId);
        if(bag != null) {
            System.out.println(bag.getProductId());
            System.out.println(bag.getProductName());
            System.out.println(bag.getPrice());
            System.out.println(bag.getQuantity());
        }else{
            System.out.println("해당 아이디가 없습니다.");
        }

    }
}