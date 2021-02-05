package com.company;

import java.util.Scanner;

public class Ch7_Theory_BinarySearch {
    public static boolean binarySearch(int key, int... numbers) {
        int low = 0, high = numbers.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] == key)
                return true;
            else if (numbers[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key:");
        int key = sc.nextInt();
        System.out.println("Does key exists:" + binarySearch(key, arr));
    }
}
