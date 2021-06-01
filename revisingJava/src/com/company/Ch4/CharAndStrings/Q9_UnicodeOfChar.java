package com.company.Ch4.CharAndStrings;

import java.util.Scanner;

public class Q9_UnicodeOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.printf("Unicode of \"%c\" is:%d", ch, (int) (ch));
    }
}
