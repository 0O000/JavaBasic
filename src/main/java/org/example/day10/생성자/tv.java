package org.example.day10.생성자;

public class tv {
    int channel;
    int volume;
    boolean onOff;

    public tv(int channel, int volume, boolean onOff) {
        this.channel = channel;
        this.volume = volume;
        this.onOff = onOff;
    }

    //멤버메서드

    public String toString() {
        return "tv{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", onOff=" + onOff +
                '}';
    }
}
