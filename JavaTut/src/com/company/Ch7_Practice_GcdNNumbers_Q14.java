package com.company;

public class Ch7_Practice_GcdNNumbers_Q14 {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static int gcdNNumbers(int... numbers) {
        int res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            res = gcd(res, numbers[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(gcdNNumbers(2, 4, 6, 8, 16));
    }
}
