package com.company;

import java.util.Scanner;

public class Ch7_Practice_cntOccurence_Q3 {
    public static void main(String[] args) {
        int cnt = 0;
        int[] arr = new int[100];
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            num = sc.nextInt();
            arr[num]++;
            cnt++;
        } while (num != 0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                System.out.printf("%d occurs %d times\n", i, arr[i]);
        }
    }
}
