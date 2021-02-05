package com.company;

import java.util.Scanner;

public class Ch6_Practice_PalindromeInteger_Q3 {
    public static int reverse(int num) {
        int revNum = 0;
        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        return revNum;
    }

    public static boolean isPalindrome(int num) {
        int revNum = reverse(num);
        return revNum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }
}
