package org.example.day13.상속;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class 스레드그래픽 extends JFrame {
    JLabel count, image, day; //전역변수, 아무데서나 접근 가능.

    public 스레드그래픽(){
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        count = new JLabel("카운트");
        image = new JLabel();
        day = new JLabel("년월일");

        FlowLayout flow = new FlowLayout(); //add()할때 순서대로 화면에 배치!
        setLayout(flow);

        Font font = new Font("궁서", Font.BOLD, 30);
        count.setFont(font);
        image.setFont(font);
        day.setFont(font);

        //Jframe에 끼워넣음.
        add(count);
        add(image);
        add(day);

        카운터스레드2 c = new 카운터스레드2();
        c.start();
        배열스레드2 a = new 배열스레드2();
        a.start();
        시각스레드2 t = new 시각스레드2();
        t.start();


        //맨끝!
        setVisible(true);
    } //생성자

    //클래스안에 끼워진 클래스(내부클래스, innerClass)
    //전역변수를 공유할 목적으로!
    public class 시각스레드2 extends Thread{

        public void run(){
            for (int i = 0; i < 3000; i++) {
                System.out.println("시각 >> " + new Date());
                day.setText("시각 >> " + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    }

    public class 카운터스레드2 extends Thread{
        //필드
        //메서드 --> 기능이 중요!!
        //public void run(){} : 동시에 실행하고 싶은 내용
        //                      비어있는 상태
        //override(== overwrite, 재정의)
        public void run(){
            for (int i = 5; i > 0; i--) {
                System.out.println("카운터 >> " + i);
                count.setText("카운터 >> " + i);
                if(i == 1){
                    JOptionPane.showMessageDialog(count, "이제 나갈시간 입니다.");
                    dispose();
                }
                try {
                    Thread.sleep(500); //1초(1000), 500(0.5초)
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
        //public void start(){ 구현된 상태! } :
        //JVM은 실행목록을 가지고 가지고 있음.
        //      실행할 것들을 실행목록에 리스트업해두고
        //      스레드는 왔다갔다하면서 조금씩 실행함.

    }
    public class 배열스레드2 extends Thread{
        String[] foods = {"src/main/java/org/example/day6/image/1.png",
                "src/main/java/org/example/day6/image/2.png",
                "src/main/java/org/example/day6/image/3.png",
                "src/main/java/org/example/day6/image/4.png",
                "src/main/java/org/example/day6/image/5.png",
                "src/main/java/org/example/day6/image/6.png"};

        public void run(){
            for (int i = 0; i < foods.length; i++) {
                System.out.println("배열 >> " + foods[i]);
                ImageIcon icon = new ImageIcon(foods[i]);
                image.setIcon(icon);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    }
}