package com.company;

import java.util.Scanner;

public class Ch5_Practice_DisplayPyramid_Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 1;
        while (temp <= num) {
            for (int i = 0; i < (num - temp); i++)
                System.out.print("  ");
            for (int i = temp; i > 1; i--)
                System.out.print(i + " ");
            System.out.print("1 ");
            for (int i = 2; i <= temp; i++)
                System.out.print(i + " ");
            System.out.print("\n");
            temp++;
        }
    }
}
