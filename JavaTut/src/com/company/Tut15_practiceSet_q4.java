package com.company;

import java.util.Scanner;

public class Tut15_practiceSet_q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str.contains("  ") || str.contains("   "));
    }
}
