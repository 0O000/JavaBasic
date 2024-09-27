package org.example.day3.repeat;

import javax.swing.*;

public class Pattern {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i < 1000; i++) {
            sum += i;
        }
        String sum2 = "";
        for (int i = 0; i < 3; i++) {
            String data = JOptionPane.showInputDialog("과목 입력: ");
            sum2 += data;
        }
        System.out.println(sum);
        System.out.println(sum2);
    }
}
