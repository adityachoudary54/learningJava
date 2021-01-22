package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Ch6_CaseStudy_GCD {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("Gcd of %d and %d is %d\n", a, b, gcd(a, b));
//        Using BigInteger class
        BigInteger x = sc.nextBigInteger();
        BigInteger y = sc.nextBigInteger();
        System.out.println(x.gcd(y));
    }
}
