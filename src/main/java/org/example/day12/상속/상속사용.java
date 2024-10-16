package org.example.day12.상속;

public class 상속사용 {
    public static void main(String[] args) {
        수퍼맨 sMan = new 수퍼맨('m', "클라크", 100, 1000, true);
//        sMan.name = "클라크";
//        sMan.age = 100;
//        sMan.power = 1000;
//        sMan.fly = true;
        System.out.println(sMan);

        sMan.space();
        sMan.run();
        sMan.eat();
    }
}
