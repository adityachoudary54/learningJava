package com.company.Ch7;

public class Q14_GcdArray {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int gcdArray(int... arr) {
        int mini = Integer.MAX_VALUE;
        for (int item : arr) {
            if (mini > item)
                mini = item;
        }
        boolean flag = true;
        for (int j : arr) {
            if (j % mini != 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return mini;
        }
        int res = gcd(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            res = gcd(res, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(gcdArray(21, 14, 35));
    }
}
