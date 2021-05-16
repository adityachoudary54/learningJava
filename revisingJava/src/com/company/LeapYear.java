package com.company;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//        Year is a leap year if divisible by 4 but not by 100 or divisible by 400
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        boolean res = ((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0);
        String s = res?"a leap year":"not a leap year";
        System.out.println(i + " is " +s);
    }
}
