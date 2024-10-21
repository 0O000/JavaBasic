package org.example.day15.컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 셋Set {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet lotto = new HashSet();

        while(true){
            int data = r.nextInt(45) + 1;
            lotto.add(data);
            if(lotto.size() == 6){
                break;
            }
        }
        System.out.println(lotto);
    }
}
