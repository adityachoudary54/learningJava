package com.company;

import java.util.Scanner;

public class Ch5_Practice_DisplayFourPatterns_Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        Pattern 1
        System.out.println("Pattern 1");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

//        Pattern 2
        System.out.println("Pattern 2");
        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

//        Pattern 3
        System.out.println("Pattern 3");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i); j++)
                System.out.print("  ");
            for (int j = i; j >= 1; j--)
                System.out.print(j + " ");
            System.out.println();
        }

//        Pattern 4
        System.out.println("Pattern 4");
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= (num - i); j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
