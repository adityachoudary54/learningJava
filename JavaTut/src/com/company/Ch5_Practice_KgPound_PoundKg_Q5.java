package com.company;

public class Ch5_Practice_KgPound_PoundKg_Q5 {
    public static void main(String[] args) {
        System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");
        for (int i = 1, j = 20; i < 20; i += 2, j += 5) {
            System.out.printf("%9.1f\t%6.1f\t|\t%6.1f\t%9.2f\n", (float) i, i * 2.2, (float) j, j / 2.2);
        }
    }
}
