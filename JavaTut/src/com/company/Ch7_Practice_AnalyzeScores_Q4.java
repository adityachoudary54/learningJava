package com.company;

import java.util.Scanner;

public class Ch7_Practice_AnalyzeScores_Q4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int cnt = 0, avg = 0;
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            num = sc.nextInt();
            avg += num;
            arr[cnt] = num;
            cnt++;
        } while (num > 0);
        avg = avg / cnt;
        int less_avg_cnt = 0;
        for (int i = 0; i < cnt; i++) {
            if (arr[i] < avg)
                less_avg_cnt++;
        }
        System.out.println("Less than avg:" + less_avg_cnt);
        System.out.println("Equal to or more than avg:" + (cnt - less_avg_cnt));
    }
}
