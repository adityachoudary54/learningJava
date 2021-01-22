package com.company;

import java.util.Scanner;

public class Ch5_Practice_ComputeE_Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double temp = 1;
        double res = 0;
        for (double i = 1; i <= num; i++) {
            res += temp;
            temp /= i;
        }
        System.out.println("Correct e:" + res);
        System.out.println("Actual e:" + Math.E);
    }
}
