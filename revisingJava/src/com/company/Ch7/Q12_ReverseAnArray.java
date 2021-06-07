package com.company.Ch7;

import java.util.Scanner;

public class Q12_ReverseAnArray {
    public static void printArray(int... arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println("");
    }

    public static void revArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        revArray(arr);
        printArray(arr);
    }
}
