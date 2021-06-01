package com.company.Ch5;

import java.util.Scanner;

public class Q49_CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowelCnt = 0, consonantCnt = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> vowelCnt++;
                case ' ' -> {
                }
                default -> consonantCnt++;
            }
        }
        System.out.printf("Vowels:%d and Consonants:%d", vowelCnt, consonantCnt);
    }
}
