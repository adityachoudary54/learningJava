package com.company;

public class Ch7_Practice_ExecutionTime_Q16 {
    public static void generateArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000000);
        }
    }

    public static boolean linearSearch(int[] arr, int key) {
        for (int item : arr) {
            if (item == key)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] arr = new int[10000000];
        int key = (int) (Math.random() * 10000000);
        generateArr(arr);
        boolean res = linearSearch(arr, key);
        System.out.println(res);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken:" + (endTime - startTime));
    }

}
