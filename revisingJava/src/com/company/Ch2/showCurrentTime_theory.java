package com.company.Ch2;

public class showCurrentTime_theory {
    public static void main(String[] args) {
        long totalMillisec = System.currentTimeMillis();
//        Secs
        long totalSecs = totalMillisec / 1000;
        long curSec = totalSecs % 60;
//        Mins
        long totalMinutes = totalSecs / 60;
        long curMinute = totalMinutes % 60;
//        Hours
        long totalHours = totalMinutes / 60;
        long curHour = totalHours % 24;
        System.out.printf("Time is %2d:%2d:%2d GMT\n", curHour, curMinute, curSec);

//        For indian time
        curMinute = (totalMinutes + 30) % 60;
        totalHours = (totalMinutes + 30) / 60;
        curHour = (totalHours + 5) % 24;
        System.out.printf("Time is %2d:%2d:%2d IST\n", curHour, curMinute, curSec);
    }
}
