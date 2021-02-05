package com.company;

import java.util.Scanner;

public class Ch6_Practice_PentagonalNumbers_Q1 {
    public static int pentagonal(int n) {
        return (n * (3 * n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(pentagonal(i));
            } else {
                System.out.print(pentagonal(i) + " ");
            }
        }
    }
}
