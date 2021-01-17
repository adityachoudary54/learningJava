// Day of the week
package com.company;

import java.util.Scanner;

public class Ch3_Q21_DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, q, m, j, k;
        System.out.print("Enter year:");
        k = sc.nextInt();
        System.out.print("Enter month:");
        m = sc.nextInt();
        if (m < 3) {
            m += 12;
            k--;
        }
        System.out.print("Enter day of the month:");
        q = sc.nextInt();
        j = k / 100;
        System.out.printf("k:%d,j:%d,m:%d,q:%d", k, j, m, q);
        h = (q + ((26 * (m + 1)) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
        System.out.println("Day of the week is:" + h);
    }
}
