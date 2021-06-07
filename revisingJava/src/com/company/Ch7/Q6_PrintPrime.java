package com.company.Ch7;

import java.util.Arrays;

public class Q6_PrintPrime {
    public static void fillPrimes(boolean[] dp) {
        Arrays.fill(dp, true);
        dp[0] = false;
        dp[1] = false;
        dp[2] = true;
        for (int i = 4; i < dp.length; i += 2) {
            dp[i] = false;
        }
        for (int i = 3; i < dp.length; i += 2) {
            if (dp[i]) {
                for (int j = 2 * i; j < dp.length; j += i) {
                    dp[j] = false;
                }
            }
        }
    }

    public static void reqPrimes(int numOfPrimes) {
        boolean[] dp = new boolean[10000];
        fillPrimes(dp);
        int[] primes = new int[500];
        int cnt = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] && cnt < numOfPrimes)
                primes[cnt++] = i;
        }
        for (int i = 0; i < cnt; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.printf("%3d\n", primes[i]);
            } else {
                System.out.printf("%3d ", primes[i]);
            }
        }
    }

    public static void printPrimes() {
        boolean[] dp = new boolean[100];
        fillPrimes(dp);
        for (int i = 0; i < dp.length; i++) {
            if (dp[i])
                System.out.print(i + " ");
        }
    }

    public static void cntPrimes() {
        boolean[] dp = new boolean[100];
        fillPrimes(dp);
        int cnt = 0;
        for (boolean b : dp) {
            if (b)
                cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
//        printPrimes();
//        cntPrimes();
        reqPrimes(50);
    }
}
