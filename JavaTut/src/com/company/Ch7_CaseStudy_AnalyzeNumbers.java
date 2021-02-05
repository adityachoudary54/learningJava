package com.company;

import java.util.Scanner;

public class Ch7_CaseStudy_AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element:");
            arr[i] = sc.nextInt();
        }

        float sum = 0;
        for (int item : arr) {
            sum += item;
        }

        float avg = sum / num;
        for (int item : arr) {
            if (item < avg) {
                System.out.println(item + " is a loser");
            } else {
                System.out.println(item + " is a winner");
            }
        }
    }
}
