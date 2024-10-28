package org.example.day19.문제_심화;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q7_Employee2Main {
    public static void main(String[] args) {
        List<Q7_Employee2> employees = Arrays.asList(
                new Q7_Employee2("Michael", "Manager", 35),
                new Q7_Employee2("Sarah", "HR", 32),
                new Q7_Employee2("Roger", "Manager", 44),
                new Q7_Employee2("Mike", "Manager", 30),
                new Q7_Employee2("Maureen", "IT", 37));
        Stream<Q7_Employee2> employee = employees.stream();
        double result = employee.filter(x -> "Manager".equals(x.getDepartment()))
                .mapToInt(Q7_Employee2::getAge)
                .average()
                .orElse(0);
        System.out.println(result);
    }
}
//1) stream()함수를 이용해 stream으로 만든다.
//2) filter()메서드를 이용해 department가 Manager인 것만 필터링한다.
//3) mapToInt(Employee2의 getAge()메서드만 호출)를 이용해 IntStream을 생성한다.
//4) 3번에서 생성한 IntStream에 대해 average()메서드로 평균을 구한다.
//5) orElse()메서드로 4번까지의 적합한 값이 존재하지 않는 경우 0을 기본 평균값으로 사용한다.
