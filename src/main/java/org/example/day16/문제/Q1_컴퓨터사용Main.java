package org.example.day16.문제;

public class Q1_컴퓨터사용Main {
    public static void main(String[] args) {
        Q1_AppleComputer apple = new Q1_AppleComputer();
        Q1_BananaComputer banana = new Q1_BananaComputer();

        apple.start();
        apple.shutDown();
        apple.restart();

        banana.start();
        banana.shutDown();
        banana.restart();
    }
}
