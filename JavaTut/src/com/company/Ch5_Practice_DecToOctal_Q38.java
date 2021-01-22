package com.company;

import java.util.Scanner;

public class Ch5_Practice_DecToOctal_Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        String s = "";
        while (temp != 0) {
            int digit = temp % 8;
            s = digit + s + "";
            temp /= 8;
        }
        System.out.println("Octal of " + num + " is " + s);
        System.out.println("Using builtin function:" + Integer.toOctalString(num));
    }
}
