package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 웹툰순위 {
    static int start = 0; //현재 위치
    //변수가 선언된 위치를 포함한 곳 안에서 사용 가능
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("웹툰 순위-네이버");
        frame.setSize(440, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //데이터 준비 --> 배열(같은 속성, 같은 타입, 많을 때 사용)
        String[] title = {"윈드 브레이커", "천재 타자", "펜 홀더", "위닝 샷", "낫 오버"};
        String[] img = {"src/main/java/org/example/day6/image/1.png",
                "src/main/java/org/example/day6/image/2.png",
                "src/main/java/org/example/day6/image/3.png",
                "src/main/java/org/example/day6/image/4.png",
                "src/main/java/org/example/day6/image/5.png"};
        double[] jumsu = {9.9, 8.8, 7.7, 6.6, 5.5};

        //입력, 처리, 출력 순으로 진행
        //텍스트 3개 들어갈 자리(위, 아래, 포스터 이미지)
        JLabel top = new JLabel();
        top.setText(title[start]);

        JLabel under = new JLabel();
        under.setText(jumsu[start] + "");
//        String.valueOf(jumsu[2]); 가능하다

        JLabel center = new JLabel();
        ImageIcon icon = new ImageIcon(img[start]);
        center.setIcon(icon);

        JButton right = new JButton(">>");
        right.addActionListener(new ActionListener() {
            //addActionListener(처리하는 부품)는 버튼을
            //클릭했을 때 처리하는 기능을 더함
            public void actionPerformed(ActionEvent e) {
                if(start < 4){
                    start++;
                    //이 actionPerformed()가 자동으로
                    //내가 클릭했을 때 실행되는 부분
                    top.setText(title[start]);
                    under.setText(jumsu[start] + "");
                    ImageIcon icon = new ImageIcon(img[start]);
                    center.setIcon(icon);
                }else{
                    JOptionPane.showMessageDialog(null, "마지막 페이지입니다.");
                }

            }
        });
        JButton left = new JButton("<<");
        left.addActionListener(new ActionListener() {
            //addActionListener(처리하는 부품)는 버튼을
            //클릭했을 때 처리하는 기능을 더함
            public void actionPerformed(ActionEvent e) {
                if(start > 0){
                    start--;
                    //이 actionPerformed()가 자동으로
                    //내가 클릭했을 때 실행되는 부분
                    top.setText(title[start]);
                    under.setText(jumsu[start] + "");
                    ImageIcon icon = new ImageIcon(img[start]);
                    center.setIcon(icon);
                }else{
                    JOptionPane.showMessageDialog(null, "첫 페이지입니다..");
                }

            }
        });

        Font font = new Font("궁서", Font.BOLD, 25);
        top.setFont(new Font("궁서", Font.BOLD, 30));

        under.setFont(font);
        left.setFont(font);
        right.setFont(font);

        left.setBackground(Color.GREEN);
        right.setBackground(Color.GREEN);
        left.setForeground(Color.BLUE);
        right.setForeground(Color.BLUE);

        frame.add(top, BorderLayout.NORTH);
        frame.add(under, BorderLayout.SOUTH);
        frame.add(center, BorderLayout.CENTER);
        frame.add(left, BorderLayout.WEST);
        frame.add(right, BorderLayout.EAST);
        //맨 끝!!
        frame.setVisible(true);
    }
}