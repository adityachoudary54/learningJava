package com.company.Ch3;

public class GeneratingRandom_theory {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        if (a - b > 0) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(a + " is smaller than " + b);
        }
        System.out.printf("a is:%3d and b is:%3d", a, b);
    }
}
