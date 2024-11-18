package org.example.jdbc4.문제.Q2_JDBC;

import org.example.jdbc4.문제.Q1_JDBC.Q1_DAO;
import org.example.jdbc4.문제.Q1_JDBC.Q1_VO;

import java.util.ArrayList;

public class Q2_SearchAllUI {
    public static void main(String[] args) throws Exception {
        Q1_DAO dao = new Q1_DAO();
        ArrayList<Q1_VO> list = dao.searchAll();
        for (Q1_VO bag : list) {
            System.out.println("ProductID: " + bag.getProductId());
            System.out.println("ProductName: " + bag.getProductName());
            System.out.println("Price: " + bag.getPrice());
            System.out.println("Quantity: " + bag.getQuantity());
            System.out.println("===============");
        }
    }
}