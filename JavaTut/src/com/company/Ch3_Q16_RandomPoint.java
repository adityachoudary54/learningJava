package com.company;

public class Ch3_Q16_RandomPoint {
    public static void main(String[] args) {
        int x,y;
        x = (int)(Math.random()*100 - 50);
        y = (int)(Math.random()*200 - 100);
        System.out.printf("coordinate is:(%d,%d)",x,y);
    }
}
