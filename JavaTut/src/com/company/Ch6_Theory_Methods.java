package com.company;

import java.util.Scanner;

public class Ch6_Theory_Methods {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum of " + a + " and " + b + " is:" + sum(a, b));
    }
}
