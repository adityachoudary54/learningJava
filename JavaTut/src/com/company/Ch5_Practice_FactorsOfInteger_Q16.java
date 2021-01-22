package com.company;

import java.util.Scanner;

public class Ch5_Practice_FactorsOfInteger_Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num % 2 == 0 && num != 0) {
            System.out.print(2 + " ");
            num = num / 2;
        }
        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
        if (num > 2)
            System.out.print(num);
    }
}
