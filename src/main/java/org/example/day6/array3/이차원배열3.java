package org.example.day6.array3;

import javax.swing.*;

public class 이차원배열3 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        String header[] ={"장소", "누구와", "언제"};
        String contents[][] = {
                {"부산", "동생", "오전출발"},
                {"대구", "친구", "오후출발"},
                {"공주", "동료", "저녁출발"}
        };
        JTable table = new JTable(contents, header);
        JScrollPane scroll = new JScrollPane(table);
        f.add(scroll);
        f.setVisible(true);
    }
}
