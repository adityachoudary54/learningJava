package com.company;

import java.util.Scanner;

public class Ch5_CaseStudy_DecToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal:");
        int num = sc.nextInt();
        String s = "";
        while (num != 0) {
            int digit = num % 16;
            if (digit < 10) {
                s = digit + "" + s;
            } else {
                s = (char) (digit - 10 + 'A') + "" + s;
            }
            num = num / 16;
        }
        System.out.println("Hexadecimal is:" + s);
    }
}
