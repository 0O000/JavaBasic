package org.example.day15.문제;

import java.util.ArrayList;

public class Q4_GenericStack<String> {
    ArrayList list = new ArrayList();
    public String pop(){
        String result = (String) list.get(list.size()-1);
        list.remove(list.size()-1);
        return result;
    }
    public void push(String name){
        list.add(name);
    }
    public String getList(){
        //첫번째 값을 안넣을 경우 Null값이 들어가기에 인덱스 0번째 값을 처음으로 지정
        String result = (String) list.get(0).toString();
        for (int i = 1; i < list.size(); i++) {
            result = (String) (result + " " + list.get(i).toString());
        }
        return result;
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    //마지막 값 반환
    public String peek(){
        return (String) list.get(list.size()-1);
    }
}
