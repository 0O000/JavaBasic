package org.example.jdbc3.read연습;

public class MemberVO {
    private String id;
    private String pw;
    private String name;
    private String tel;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPw() {
        return pw;
    }

    public String getTel() {
        return tel;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}