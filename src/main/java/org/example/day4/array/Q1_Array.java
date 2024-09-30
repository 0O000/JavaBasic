package org.example.day4.array;

import java.util.Random;
import java.util.Scanner;

public class Q1_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1. ppt p .48 성적변동문제
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};

        int up = 0;
        int same = 0;

        for(int i = 0; i < term1.length; i++){
            if(term1[i] == term2[i]){
                same++;
            }
            if(term1[i] < term2[i]){
                up++;
            }
        }
        System.out.println("향상된 학생: " + up + " 동일한 학생: " + same);
//
//        2. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
//        숫자 입력 :55
//        숫자 입력 :77
//        숫자 입력 :11
//                ----------------
//        합계 143
//        평균 47.666666667

        int sum = 0;

        int[] num = new int[3];
        for(int i = 0; i < num.length; i++){
            System.out.print("숫자 입력: ");
            num[i] = sc.nextInt();
            sum += num[i];
        }
        double avg = (double)sum / 3;
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
//
//        3. int[] n = new int[1000];
//        random한 값 1 ~1000 까지 배열에 넣어 전체 출력(씨앗값 :44)
        Random r = new Random(44);
        int sum1 = 0;
//        3 - 1. 첫번째값, 세번째값, 다섯번째값, 100 번째값, 990 번째 값을 더한 결과값 출력
        sum1 = 0;
        int sum2 = 0;
        int[] random = new int[990];
        for(int i = 0; i < 990; i++){
            random[i] = r.nextInt(1000) + 1;
            sum2 += random[i];
        }
        sum1 = random[0] + random[2] + random[4] + random[99] + random[989];
        System.out.println(sum1);
//        3 - 2. 전체 합계와 평균 출력
        System.out.println("전체 합계: " + sum2 + " 평균: " + sum2/990);
//
//        4. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
//        (단, 다음에서 입력한 답이 1 이면 열차, 2 이면 배, 3 이면 비행기를 타고 감.)
        System.out.println("가고싶은 수단을 고르세요 : 1.열차 2.배 3.비행기");
        String[] veh = {"열차", "배", "비행기"};
        int vehIn = sc.nextInt() - 1;
//        가고 싶은 곳(보기, 1) 백두산, 2)한라산, 3)후지산)입력 >> 1
        System.out.println("가고싶은 곳을 고르세요: 1.백두산 2.한라산 3.후지산");
        String[] point = {"백두산", "한라산", "후지산"};
        int pointIn = sc.nextInt() - 1;
        System.out.println("당신이 가고 싶은 곳인 " + point[pointIn] + "은 " + veh[vehIn] + "를 타고 가야합니다.");

//        당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.
//
//        5. random한 값 1 부터 100 까지 배열에 넣어 전체 출력(씨앗값 :555)
//        80 보다 큰 수 개수, 70 ~79 인 수 개수, 50 ~69 인 수 개수, 49 보다 작은 수 개수 카운트하여 출력
        int[] randomArray = new int[10];
        int ran = 0;
        int type01 = 0;
        int type02 = 0;
        int type03 = 0;
        int type04 = 0;

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = r.nextInt(100) + 1;
            if(randomArray[i] > 80){
                type01++;
            } else if (randomArray[i] > 70) {
                type02++;
            }else if (randomArray[i] > 50) {
                type03++;
            }else if (randomArray[i] < 49) {
                type04++;
            }
        }
        System.out.println("80 보다 큰 수 개수: " + type01 + " 70 ~79 인 개수: " + type02 + " 50 ~69 인 개수: " + type03 + " 49 보다 작은 수 개수: " + type04);
    }
}