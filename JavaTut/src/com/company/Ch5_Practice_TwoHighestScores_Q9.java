package com.company;

import java.util.Scanner;

public class Ch5_Practice_TwoHighestScores_Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int highest = Integer.MIN_VALUE, second_highest = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            if (x > highest) {
                second_highest = highest;
                highest = x;
            } else if (x > second_highest) {
                second_highest = x;
            }
        }
        System.out.printf("Highest:%d Second Highest:%d", highest, second_highest);

    }
}
