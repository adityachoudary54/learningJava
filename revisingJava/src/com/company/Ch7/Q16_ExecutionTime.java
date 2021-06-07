package com.company.Ch7;

import java.util.Arrays;

public class Q16_ExecutionTime {
    public static void linearSearch(int[] arr, int key) {
        for (int j : arr) {
            if (j == key) {
                System.out.printf("Match Found Using Linear Search which is:%d\n", key);
                return;
            }
        }
        System.out.println("No match found using Linear Search");
    }

    public static void binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                System.out.printf("Match Found Using Binary Search which is:%d\n", key);
                return;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("No match found using Binary Search");
    }

    public static void executionTimeFunc(int[] arr, int key, int ch) {
        long startTime = System.currentTimeMillis();
        if (ch == 0)
            linearSearch(arr, key);
        else
            binarySearch(arr, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println(executionTime);
    }

    public static void main(String[] args) {
        int[] arr = new int[10000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000 + 1);
        }
        int key = (int) (Math.random() * 100000 + 1);
        executionTimeFunc(arr, key, 0);
        Arrays.sort(arr);
        executionTimeFunc(arr, key, 1);

    }
}
