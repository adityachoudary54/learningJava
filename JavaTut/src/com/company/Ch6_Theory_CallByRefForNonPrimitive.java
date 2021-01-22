package com.company;

import java.util.Scanner;

public class Ch6_Theory_CallByRefForNonPrimitive {
    public static void change(String s) {
        System.out.println("Before changing in change:" + s);
        s = "bkwas";
        System.out.println("After changing in change:" + s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Before change:" + s);
        change(s);
        System.out.println("After change:" + s);
    }
}
