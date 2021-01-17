package com.company;

import java.util.Scanner;

public class Ch4_StringFunc {
    public static void main(String[] args) {
//        String to int
//        System.out.println("String to int\n");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a string:");
//        String s = sc.nextLine();
//        int sToInt = Integer.valueOf(s);
//        System.out.println(sToInt + 10);
//
//        int to String
//        System.out.println("\nint to String\n");
//        System.out.println("Enter an integer:");
//        int a = sc.nextInt();
//        String aToString = String.valueOf(a);
//        System.out.println(aToString + "HelloWorld");

//        Simple methods
        String s = "Aditya";
        System.out.println("\nSimple string methods\n");
        System.out.printf("Length of string \"aditya\" is:%d\n", "aditya".length());
        System.out.println("s.charAt(3):" + s.charAt(3));
        System.out.println("s.toUpperCase()" + s.toUpperCase());
        System.out.println("s.toLowerCase()" + s.toLowerCase());
        s = "     Aditya          ";
        System.out.println("s.trim():"+s.trim());
    }
}
