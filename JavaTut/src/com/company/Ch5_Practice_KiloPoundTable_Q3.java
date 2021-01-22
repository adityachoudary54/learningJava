package com.company;

public class Ch5_Practice_KiloPoundTable_Q3 {
    public static void main(String[] args) {
        System.out.println("Kilograms\tPounds");
        for (int i = 1; i < 10; i += 2) {
            System.out.printf("%9.2f\t%6.2f\n", (float) i, i * 2.2);
        }
    }
}
