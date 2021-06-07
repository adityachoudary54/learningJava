package com.company.Ch8;

import java.util.Scanner;

public class Q11_NineHeadsTails {
    public static char[][] solve(int num) {
        String temp = String.format("%1$" + 9 + "s", Integer.toBinaryString(num) + "").replace(' ', '0');
        char[][] res = new char[3][3];
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = temp.charAt(cnt++) == '1' ? 'T' : 'H';
            }
        }
        return res;
    }

    public static void printMat(char[][] mat) {
        for (char[] chars : mat) {
            for (char ch : chars) {
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[][] mat = solve(num);
        printMat(mat);
    }
}
