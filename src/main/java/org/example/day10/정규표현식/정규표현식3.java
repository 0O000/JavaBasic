package org.example.day10.정규표현식;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 정규표현식3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        우리회사 직원 정보를 입력받기!
        System.out.print("이름입력: ");
        String name = sc.nextLine();
        boolean checkName = Pattern.matches("[가-힣]{2,4}", name);//한글로 이루어진 3~5 글자만 가능함
        if(checkName) {
            System.out.println(name + "님 환영합니다.");
        }
        else{
            System.out.println("다시 입력해야합니다.");
        }
        System.out.println(checkName);
        System.out.print("나이입력: ");
        String age = sc.nextLine();
        boolean checkAge = Pattern.matches(age, "^[0-9]]$");
        if(checkAge) {
            int intAge = Integer.parseInt(age);
            System.out.println("만 나이는 " + (intAge - 1) + "입니다.");
        }else{
            System.out.println("숫자를 입력해 주세요.");
        }
        System.out.print("이메일입력: ");
        String email = sc.nextLine();
        boolean checkEmail = Pattern.matches("^[a-zA-z0-9]{4,8}+@new+\\.com$", email);
        //^[a-zA-z0-9] == \\w
        if(checkEmail) {
            System.out.println("이메일이 유효합니다.");
        }else{
            System.out.println("이메일이 유효하지 않습니다.");
        }

        sc.close();
    }
}
