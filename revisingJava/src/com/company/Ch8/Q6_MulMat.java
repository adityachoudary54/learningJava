package com.company.Ch8;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_MulMat {
    public static double[][] inputMat() {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Enter number of rows:");
        m = sc.nextInt();
        System.out.println("Enter number of cols:");
        n = sc.nextInt();
        double[][] mat = new double[m][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }
        return mat;
    }

    public static double[][] mulMat(double[][] mat1, double[][] mat2) {
        double[][] res = new double[mat1.length][mat2[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                for (int k = 0; k < mat2[0].length; k++) {
                    res[i][k] += mat1[i][j] * mat2[j][k];
                }
            }
        }
        return res;
    }

    public static void printMat(double[][] mat) {
        for (double[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter matrix 1");
        double[][] mat1 = inputMat();
        System.out.println("Enter matrix 2");
        double[][] mat2 = inputMat();
        printMat(mat1);
        printMat(mat2);
        printMat(mulMat(mat1, mat2));
    }
}
