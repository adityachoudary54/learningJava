package com.company.Ch8;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_SumCol {
    public static int[] sumCol(int[][] mat) {
        int[] res = new int[mat[0].length];
        Arrays.fill(res, 0);
        for (int[] row : mat) {
            for (int i = 0; i < row.length; i++) {
                res[i] += row[i];
            }
        }
        return res;
    }

    public static void inputMat(int[][] mat) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows:");
        int m = sc.nextInt();
        System.out.print("Number of cols:");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        inputMat(mat);
        System.out.println(Arrays.toString(sumCol(mat)));
    }
}
