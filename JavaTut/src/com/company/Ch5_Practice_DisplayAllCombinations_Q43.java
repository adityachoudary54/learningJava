package com.company;

public class Ch5_Practice_DisplayAllCombinations_Q43 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 1; i <= 7; i++) {
            for (int j = i + 1; j <= 7; j++) {
                cnt++;
                System.out.println(i + " " + j);
            }
        }
        System.out.println("The total number of combinations is:" + cnt);
    }
}
