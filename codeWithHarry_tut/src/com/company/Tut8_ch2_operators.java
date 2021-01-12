package com.company;

import static java.lang.Math.pow;

public class Tut8_ch2_operators {
    public static void main(String[] args) {
//        Assignment
        int a=6;
        System.out.println("a="+a);
//        Arithmetic
        int x=2,y=3;
        System.out.println("x+y="+(x+y));
//        Comparison
        System.out.println("24<32="+(24<32));
//        Logical
        System.out.println("24<32 && 24>32="+(24<32 && 24>32));
//        Bitwise
        System.out.println("2&3="+(2&3));

//        % operator works for float also
        System.out.println("4.4%1.2="+(4.4%1.2));
//        Calculating power in java
        System.out.println(pow(2,3.8));
    }
}
