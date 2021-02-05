package com.company;

public class Ch7_Theory_Arrays {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr.length);
        for (int i = 0; i < 10; i++) {
            arr[i] = i * i;
        }
        System.out.println("Elements of array arr are->");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
//        using initializer
        int[] myList = {1,2,3,4,124};
        System.out.println("Elements of initialized array are->");
//        Using enhanced for loop for array(foreach loop)
        for (int j : myList) {
            System.out.println(j);
        }
    }
}
