package com.company.Ch8;

import java.util.Arrays;
import java.util.Scanner;

public class Q16_2dSort {
    public static void TwoDSort(int[][] mat) {
        Arrays.sort(mat, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] > b[0]) {
                    return 1;
                } else if (a[0] < b[0]) {
                    return -1;
                }

                if (a[1] > b[1]) {
                    return 1;
                } else if (a[1] < b[1]) {
                    return -1;
                }
                return 0;
            }
        });
    }

    public static void inputMat(int[][] mat){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMat(int[][] mat) {
        for (int[] ints : mat) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        TwoDSort(mat);
        printMat(mat);
    }
}
