package com.company;

import java.util.Scanner;

public class Ch5_Practice_DecToBinary_Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        String s = "";
        while (temp != 0) {
            int digit = temp % 2;
            s = digit + s + "";
            temp /= 2;
        }
        System.out.println("Binary of " + num + " is " + s);
        System.out.println("Using builtin function:" + Integer.toBinaryString(num));
    }
}
