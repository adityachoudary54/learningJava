package com.company;

import java.util.Scanner;

public class Tut12_PracticeSet_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        way to take character input
        char ch = sc.next().charAt(0);
        int a = ch+8;
        System.out.println("the grade is:"+(char)(a-8));
    }
}
