package com.company.Ch5;

import java.util.Scanner;

public class Q45_MeanAndStandardDeviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        double squaredSum = 0, sum = 0, cnt = 0;
        while (input != -1) {
            sum += input;
            squaredSum += Math.pow(input, 2);
            cnt++;
            input = sc.nextDouble();
        }
        System.out.printf("Mean is:%f\n", sum / cnt);
        double std = Math.pow(squaredSum / cnt - Math.pow(sum / cnt, 2), 0.5);
        System.out.printf("Standard Deviation is:%f\n", std);
    }
}
