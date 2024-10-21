package org.example.day15.기본형형변환;

public class 기본형1 {
    public static void main(String[] args) {
        //기본형 형변환: 형(변수에 들어가는 데이터 타입, 유형)
        //실제로 코딩하다보면 데이터가 다양한 형태의 변수로 들어갔다 나왔다를 반복
        byte b1 = 100;
        int i1 = 200;

        i1 = b1; //가능 큰공간 <- 작은공간 데이터
//        b1 = i1; //불가능 작은공간 <- 큰공간 데이터 강제형변환
    }
}
