package com.company;

import java.util.Scanner;

public class Ch6_CaseStudy_HexToDec {
    public static int hexToDec(String hex) {
        int num = 0;
        for (int i = 0; i < hex.length(); i++) {
            int digit = Character.isDigit(hex.charAt(i)) ? hex.charAt(i) - '0' : hex.charAt(i) - 'A' + 10;
            num = 16 * num + digit;
        }
        return num;
    }

    public static void main(String[] args) {
//        BuiltIn
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hexadecimal:");
        String hex = sc.nextLine();
        System.out.printf("Decimal of %s is using builtin function is:%d\n", hex, Integer.parseInt(hex, 16));
//        Custom
        System.out.printf("Decimal of %s is using custom function is:%d", hex, hexToDec(hex));

    }
}
