package com.company;

import java.util.Scanner;

public class Ch6_Practice_SumOfDigits_Q2 {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The sum of digits of entered number is:" + sumOfDigits(num));
    }
}
