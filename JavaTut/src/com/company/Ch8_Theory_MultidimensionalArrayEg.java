package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ch8_Theory_MultidimensionalArrayEg {
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
        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
