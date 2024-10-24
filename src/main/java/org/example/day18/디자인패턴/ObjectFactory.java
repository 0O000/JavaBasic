package org.example.day18.디자인패턴;

public class ObjectFactory {
    public Object createObject(String objectType) {
        if (objectType.equalsIgnoreCase("apple")) {
            return new 애플클래스();
        } else if (objectType.equalsIgnoreCase("banana")) {
            return new 바나나클래스();
        } else {
            return null;
        }
    }
}