package com.company;

public class Tut9_ch2_associativity {
    public static void main(String[] args) {
//        Precedence and associativity
        int a=6*5-34/2;
        int b=60/5-34*2;
        System.out.println(a);
        System.out.println(b);
        long totalMilli=System.currentTimeMillis();
        System.out.println("Total sec = " + totalMilli/1000);
    }
}
