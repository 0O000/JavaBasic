package org.example.jdbc2;

public class TestLombok2 {
    public static void main(String[] args) {
        BoardVO vo = new BoardVO();

        vo.setNo(1);
        vo.setContent("반지하 여행");
        vo.setTitle("반지의 제왕");
        vo.setWirter("돌킨");
        System.out.println(vo.toString());
    }
}
