package com.company;

import java.util.Arrays;

public class Ch8_Theory_RaggedArray {
    public static void main(String[] args) {
        int[][] matrix = new int[5][];
        for (int i = 0; i < 5; i++) {
            matrix[i] = new int[5 - i];
        }
        for (int[] item : matrix) {
            System.out.println(Arrays.toString(item));
        }
    }
}
