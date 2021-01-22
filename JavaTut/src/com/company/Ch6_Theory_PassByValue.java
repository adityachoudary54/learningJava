package com.company;

import java.util.Scanner;

public class Ch6_Theory_PassByValue {
    public static void swap(int a, int b) {
        System.out.printf("Before swap inside swap method %d %d\n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("After swap inside swap method %d %d\n", a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("Before swap %d %d\n", a, b);
        swap(a, b);
        System.out.printf("After swap %d %d\n", a, b);
    }
}
