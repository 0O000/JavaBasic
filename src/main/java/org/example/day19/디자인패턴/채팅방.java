package org.example.day19.디자인패턴;

import java.util.ArrayList;
import java.util.List;

public class 채팅방 {
    List<User> users; //채팅창에 들어온 사람들 목록

    채팅방(){
        this.users = new ArrayList<>();
    }

    void addUser(User user){
        users.add(user);
    }

    void removeUser(User user){
        users.remove(user);
    }

    void notifyUser(String m){
        for(User user : users){
            user.update(m);
        }
    }
}
