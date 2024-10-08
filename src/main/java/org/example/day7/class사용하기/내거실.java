package org.example.day7.class사용하기;

import org.example.day7.class만들기.Dog;
import org.example.day7.class만들기.TV;
import org.example.day7.class만들기.Television;

public class 내거실 {
    public static void main(String[] args) {
        Television tv = new Television();
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        TV myTv = new TV();
        TV yourTv = new TV();

        tv.powerOn();
        //tv.changCh();
        tv.powerOff();
        System.out.println(tv.size);
        System.out.println(tv.price);
        tv.size = "small";
        tv.price = 10000;
        System.out.println(tv.size);
        System.out.println(tv.price);

        dog.age = 5;
        dog.color = "white";
        dog.run();
        dog.bark();
        dog2.age = 8;
        dog2.color = "black";
        System.out.println(dog.age + " " + dog.color + " " + dog2.age + " " + dog2.color);

        //메서드는 생성된 객체의 주소만 있으면 된다.
        myTv.채널을바꾸다();
        yourTv.채널을바꾸다();
        myTv.vol = 9;
        yourTv.vol = 8;
        myTv.onOff = true;
        yourTv.onOff = true;
    }
}
