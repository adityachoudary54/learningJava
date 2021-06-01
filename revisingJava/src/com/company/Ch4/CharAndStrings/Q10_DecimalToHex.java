package com.company.Ch4.CharAndStrings;

import java.util.Scanner;

public class Q10_DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder s = new StringBuilder();
        int temp = num;
        while (num > 0) {
            int rem = num % 16;
            if (rem > 10) {
                s.insert(0, (char) ('a' + rem - 10));
            } else {
                s.insert(0, rem);
            }
            num /= 16;
        }
        System.out.println(s);
        System.out.println(Integer.toHexString(temp));
    }
}
