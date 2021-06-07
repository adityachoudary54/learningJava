package com.company.Ch6;

import java.util.Scanner;

public class Q3_Palindrome {
    static String reverse(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i) + temp;
        }
        return temp;
    }

    static boolean isPalindrome(String str) {
        String revStr = reverse(str);
        return str.equals(revStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.printf("%s is a palindrome", str);
        } else {
            System.out.printf("%s is not a palindrome", str);
        }
    }
}
