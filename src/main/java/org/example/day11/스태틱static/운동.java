package org.example.day11.스태틱static;

public class 운동 {
    static int count;
    private static int sum;

    String work;
    String collaborate;
    int time;

    public 운동(String work, String collaborate, int time) {
        this.work = work;
        this.collaborate = collaborate;
        this.time = time;
        count++;
        sum = sum + time;
    }

    public static int getCount() {
        return count;
    }

    public static int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "운동{" +
                "work='" + work + '\'' +
                ", collaborate='" + collaborate + '\'' +
                ", time=" + time +
                '}';
    }
}
