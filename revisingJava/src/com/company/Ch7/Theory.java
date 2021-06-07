package com.company.Ch7;

import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {
        int[] temp = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            temp[i] = sc.nextInt();
        }
        System.out.println(temp.length);
    }
}
