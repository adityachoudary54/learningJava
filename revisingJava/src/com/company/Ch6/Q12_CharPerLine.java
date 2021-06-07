package com.company.Ch6;

public class Q12_CharPerLine {
    static void charPerLine(char start, char end, int charPerLine) {
        for (char i = start, cnt = 1; i <= end; i++, cnt++) {
            if (cnt % charPerLine == 0) {
                System.out.println(i);
            } else {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        charPerLine('a', 'z', 8);
    }
}
