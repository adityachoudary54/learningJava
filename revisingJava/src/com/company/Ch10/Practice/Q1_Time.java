package com.company.Ch10.Practice;

import java.util.Date;

class Time {
    private long hr, min, sec;

    Time(long millisec) {
        long totalSec = millisec / 1000;
        sec = totalSec % 60;
        long totalMin = totalSec / 60;
        min = totalMin % 60;
        long totalHr = totalMin / 60;
        hr = totalHr % 24;
    }

    Time() {
        this(System.currentTimeMillis());
    }

    Time(long hr, long min, long sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public long getHr() {
        return hr;
    }

    public long getMin() {
        return min;
    }

    public long getSec() {
        return sec;
    }

    public void setTime(long elapseTime) {
        long totalSec = elapseTime / 1000;
        sec = totalSec % 60;
        long totalMin = totalSec / 60;
        min = totalMin % 60;
        long totalHr = totalMin / 60;
        hr = totalHr % 24;
    }

    public String printTime() {
        return String.format("%2d:%2d:%2d", hr, min, sec);
    }
}

public class Q1_Time {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.printTime());
        time.setTime(555550000);
        System.out.println(time.printTime());
    }
}
