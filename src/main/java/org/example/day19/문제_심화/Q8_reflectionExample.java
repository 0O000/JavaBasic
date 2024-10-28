package org.example.day19.문제_심화;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Q8_reflectionExample {
    public static void main(String[] args) {
        try{
            Class<?> clazz = Class.forName("org.example.day19.문제_심화.Q8_reflection");

            Method sayHelloMethod = clazz.getMethod("sayHello", Object.class);
            Method sayGoodbyeMethod = clazz.getMethod("sayGoodbye", String.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
