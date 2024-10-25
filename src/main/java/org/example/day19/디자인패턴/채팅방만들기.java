package org.example.day19.디자인패턴;

public class 채팅방만들기 {
    public static void main(String[] args) {
        채팅방 room = new 채팅방();
        User user = new User("홍길동");
        room.addUser(user);
        room.addUser(new User("김길동"));
        room.addUser(new User("박길동"));

        room.notifyUser("오늘은 금요일!");

        //채팅창에서 "홍길동" 삭제
        //내용을 보내보기
        room.removeUser(user);
        room.notifyUser("내일은 토요일!");
    }
}
