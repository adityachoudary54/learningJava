package com.company;

import java.util.Arrays;

public class Ch7_Theory_Utils {
    public static void printArr(int... numbers) {
        for (int item : numbers) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 3, 4, 6, 7, 3, 5, 7};
//        Sorting
//        Arrays.sort(arr);
        Arrays.sort(arr, 1, 5);
//        Searching
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 100));
        printArr(arr);
//        equals
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(Arrays.equals(arr1, arr2));
//        fill
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.fill(t, 1, 4, 100);
        printArr(t);
        Arrays.fill(t, 200);
        printArr(t);
//        toString
        System.out.println(Arrays.toString(arr));
    }
}
