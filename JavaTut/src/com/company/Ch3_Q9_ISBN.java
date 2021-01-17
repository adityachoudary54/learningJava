// Check ISBN-10
package com.company;

import java.util.Scanner;

public class Ch3_Q9_ISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int d_10 = ((s.charAt(0) - '0') * 1 + (s.charAt(1) - '0') * 2 + (s.charAt(2) - '0') * 3 + (s.charAt(3) - '0') * 4 + (s.charAt(4) - '0') * 5 + (s.charAt(5) - '0') * 6 + (s.charAt(6) - '0') * 7 + (s.charAt(7) - '0') * 8 + (s.charAt(8) - '0') * 9) % 11;
        String res;
        if (d_10 == 10) {
            res = s + "X";
        } else {
            res = s + String.valueOf(d_10);
        }
        System.out.println(res);
    }
}
