package com.company.Ch7;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_AssignGrade {
    public static char assignGrade(int num, int best) {
        if (num >= best - 10) {
            return 'A';
        } else if (num >= best - 20) {
            return 'B';
        } else if (num >= best - 30) {
            return 'C';
        } else if (num >= best - 40) {
            return 'D';
        }
        return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the scores obtained->");
        int[] scoreList = new int[4];
        for (int i = 0; i < 4; i++) {
            scoreList[i] = sc.nextInt();
        }
        int bestScore =  Arrays.stream(scoreList).max().getAsInt();
        for (int item : scoreList) {
            System.out.printf("The grade for %d marks is:%c\n", item, assignGrade(item, bestScore));
        }
    }
}
