package com.company;

public class Ch7_Theory_VarArgs {
    public static void printArray(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
        for (double item : numbers) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(2, 3, 4.5, 8, 9);
        printArray(new double[]{1, 2, 3, 4});
    }
}
