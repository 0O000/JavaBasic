package org.example.day19.문제_심화;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q6_람다_스트림 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig");
//        1. 문자열길이가 5 이상인것들만필터링한다.
//        2. 각 문자열을모두소문자로변환한다.
//        3. 각 문자열의첫 글자를키로하여그룹화한다.
//        4. 각 그룹의문자열수를계산한다.
//        5. 그룹화된데이터를글자순으로정렬하여출력한다.
        words.stream()
                .filter(word -> word.length() >= 5)
                .map(String::toLowerCase);
    }
}
