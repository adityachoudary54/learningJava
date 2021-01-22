package com.company;

public class Ch5_Practice_DisplayAsciiTable_Q15 {
    public static void main(String[] args) {
        int cnt = 1;
        for (char ch = '!'; ch != '~'; ch++, cnt++) {
            if (cnt % 10 == 0) {
                System.out.println(ch);
            } else {
                System.out.printf("%c ", ch);
            }
        }
    }
}
