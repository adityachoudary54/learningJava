package com.company.Ch4.CharAndStrings;

import java.util.Scanner;

public class Q22_CheckSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.length() >= str2.length()) {
            if (str1.contains(str2)) {
                System.out.printf("%s is a substring of %s", str2, str1);
            } else {
                System.out.println("Not a substring");
            }
        } else {
            if (str2.contains(str1)) {
                System.out.printf("%s is a substring of %s", str1, str2);
            } else {
                System.out.println("Not a substring");
            }
        }
    }
}
