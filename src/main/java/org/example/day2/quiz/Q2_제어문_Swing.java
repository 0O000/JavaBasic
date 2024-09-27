package org.example.day2.quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2_제어문_Swing extends JFrame {
    // 컴포넌트 선언
    private JTextField player1Input, player2Input;
    private JLabel resultLabel, score1Label, score2Label, countLabel;
    private JButton playButton, resetButton;

    // 게임 상태 변수
    private int score1 = 0;  // 첫 번째 플레이어의 점수
    private int score2 = 0;  // 두 번째 플레이어의 점수
    private int count = 0;   // 총 게임 수

    public Q2_제어문_Swing() {
        // 프레임 설정
        setTitle("숫자 게임");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // 첫 번째 플레이어 입력 컴포넌트
        add(new JLabel("첫 번째 사람의 숫자 입력: "));
        player1Input = new JTextField();
        add(player1Input);

        // 두 번째 플레이어 입력 컴포넌트
        add(new JLabel("두 번째 사람의 숫자 입력: "));
        player2Input = new JTextField();
        add(player2Input);

        // 결과 표시 레이블
        resultLabel = new JLabel("결과: 게임을 시작하세요!");
        add(resultLabel);

        // 게임 수, 점수 레이블
        countLabel = new JLabel("총 게임 수: 0");
        add(countLabel);
        score1Label = new JLabel("첫 번째 사람이 이긴 수: 0");
        add(score1Label);
        score2Label = new JLabel("두 번째 사람이 이긴 수: 0");
        add(score2Label);

        // "게임 시작" 버튼
        playButton = new JButton("게임 시작");
        add(playButton);

        // "게임 초기화" 버튼
        resetButton = new JButton("게임 초기화");
        add(resetButton);

        // 버튼 이벤트 처리
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playGame();  // 게임 로직 실행
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGame();  // 게임 초기화
            }
        });

        setVisible(true);
    }

    // 게임 로직 처리 메서드
    private void playGame() {
        try {
            int a = Integer.parseInt(player1Input.getText());  // 첫 번째 사람 숫자
            int b = Integer.parseInt(player2Input.getText());  // 두 번째 사람 숫자

            if (a > b) {
                resultLabel.setText("결과: 첫 번째 사람이 이겼습니다.");
                score1++;
            } else if (a < b) {
                resultLabel.setText("결과: 두 번째 사람이 이겼습니다.");
                score2++;
            } else {
                resultLabel.setText("결과: 무승부입니다.");
            }

            count++;  // 게임 수 증가
            updateLabels();

        } catch (NumberFormatException ex) {
            resultLabel.setText("숫자를 정확히 입력해주세요!");
        }
    }

    // 결과 레이블 업데이트 메서드
    private void updateLabels() {
        countLabel.setText("총 게임 수: " + count);
        score1Label.setText("첫 번째 사람이 이긴 수: " + score1);
        score2Label.setText("두 번째 사람이 이긴 수: " + score2);
    }

    // 게임 초기화 메서드
    private void resetGame() {
        score1 = 0;
        score2 = 0;
        count = 0;
        resultLabel.setText("결과: 게임을 시작하세요!");
        updateLabels();
        player1Input.setText("");
        player2Input.setText("");
    }

    public static void main(String[] args) {
        new Q2_제어문_Swing();
    }
}