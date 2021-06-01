package com.company.Ch4.CharAndStrings;

import java.util.Scanner;

public class Q8_CharOfASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("Char of %d is:%c", num, (char) (num));
    }
}
