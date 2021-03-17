package com.company;

import java.util.Scanner;

public class Ch8_Theory_PassingToMethods {
    public static int sumMatrix(int[][] mat) {
        int sum = 0;
        for (int[] ints : mat) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        m = sc.nextInt();
        System.out.print("Enter the number of cols:");
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of all elements in the matrix is:" + sumMatrix(matrix));
    }
}
