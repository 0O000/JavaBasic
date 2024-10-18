package org.example.day14.크롤링;

import javax.swing.*;
import java.util.Arrays;

public class 증권크롤러Main2 {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog("코드를 입력하세요!");
        //005930, 035720
        증권크롤러2 naver = new 증권크롤러2();
        try {
            String[] data = naver.crawl(code);
            JOptionPane.showMessageDialog(null,
                    "코드: " + code +
                    "\n최고가: " + data[1] +
                    "\n전일가: " + data[2]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
