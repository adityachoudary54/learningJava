package com.company;

import java.util.Scanner;

public class Ch5_Practice_CancellationErrors_Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double sum = 0;
        for (double i = num; i >= 1; i -= 1) {
            sum += 1 / i;
        }
        System.out.println("Correct order:" + sum);
        sum = 0;
        for (double i = 1; i <= num; i++) {
            sum += (1 / i);
        }
        System.out.println("Incorrect order:" + sum);
    }
}
