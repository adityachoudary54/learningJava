package com.company.Ch4.CharAndStrings;

import java.util.Scanner;

public class Q15_PhoneKeypad {
    static boolean checkInRange(char input, char start, char end) {
        return Character.toLowerCase(input) >= start && Character.toLowerCase(input) <= end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (checkInRange(ch, 'a', 'c')) {
            System.out.println(2);
        } else if (checkInRange(ch, 'd', 'f')) {
            System.out.println(3);
        } else if (checkInRange(ch, 'g', 'i')) {
            System.out.println(4);
        } else if (checkInRange(ch, 'j', 'l')) {
            System.out.println(5);
        } else if (checkInRange(ch, 'm', 'o')) {
            System.out.println(6);
        } else if (checkInRange(ch, 'p', 's')) {
            System.out.println(7);
        } else if (checkInRange(ch, 't', 'v')) {
            System.out.println(8);
        } else if (checkInRange(ch, 'w', 'z')) {
            System.out.println(9);
        } else {
            System.out.println("Invalid input");
        }
    }
}
