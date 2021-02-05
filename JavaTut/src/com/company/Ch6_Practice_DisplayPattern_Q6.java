package com.company;

import java.util.Scanner;

public class Ch6_Practice_DisplayPattern_Q6 {
    public static void displayPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i + 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        displayPattern(num);
    }
}
