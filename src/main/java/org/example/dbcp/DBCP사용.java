package org.example.dbcp;

public class DBCP사용 {
    public static void main(String[] args) {
        DBCP dbcp1 = DBCP.getInstance();
        //없으면 만들고, 있으면 리턴
        System.out.println(dbcp1);
        DBCP dbcp2 = DBCP.getInstance();
        System.out.println(dbcp2);
    }
}
