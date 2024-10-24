package org.example.day18.람다식;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class 람다스트림1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("홍길동");
        names.add("김길동");
        names.add("이길동");
        names.add("박길동");
        names.add("최길동");
        names.add("홍익인간");

        names.stream().forEach(name -> System.out.println(name));
        List<String> result = names.stream().filter(name -> name.startsWith("홍")).collect(Collectors.toList());
        System.out.println(result);
    }
}
