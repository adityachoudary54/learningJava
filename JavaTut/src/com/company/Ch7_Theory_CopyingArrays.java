package com.company;

public class Ch7_Theory_CopyingArrays {
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        Merely copies references
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = arr1;
        System.out.println("Soft copy eg");
        printArray(arr1);
        printArray(arr2);
        arr1[0] = 20;
        printArray(arr1);
        printArray(arr2);
//        Creating actual copy
//        Method 1: assign using for loop
        int[] arrP = {1, 2, 3, 4};
        int[] arrQ = new int[arrP.length];
        for (int i = 0; i < arrP.length; i++) {
            arrQ[i] = arrP[i];
        }
        printArray(arrP);
        printArray(arrQ);
        arr1[0] = 100;
        printArray(arrP);
        printArray(arrQ);

//        Using System.arraycopy
//        Also works for substring
        int[] arrX = {1,2,3,4,5,6,7,8,9,10};
        int[] arrY = new int[4];
        System.arraycopy(arrX,3,arrY,0,4);
        printArray(arrX);
        printArray(arrY);

//        Using clone(details in chapter 13)
        int[] input1 = {1,2,3,4};
        int[] input2 = input1.clone();
    }
}
