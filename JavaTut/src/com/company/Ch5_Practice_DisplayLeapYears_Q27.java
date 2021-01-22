package com.company;

public class Ch5_Practice_DisplayLeapYears_Q27 {
    public static void main(String[] args) {
        for (int i = 101, cnt = 1; i < 2100; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                if (cnt % 10 == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
                cnt++;
            }
        }
    }
}
