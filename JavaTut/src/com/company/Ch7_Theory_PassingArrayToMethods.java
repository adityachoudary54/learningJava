package com.company;

public class Ch7_Theory_PassingArrayToMethods {
    public static void printArray(int[] a) {
        for (int item : a) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new int[]{1, 2, 3, 4, 5});
    }
}
