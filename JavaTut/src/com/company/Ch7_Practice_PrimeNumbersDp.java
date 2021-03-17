package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ch7_Practice_PrimeNumbersDp {
    //    Sieve Of Eratosthenes tells how many prime numbers smaller than or equal to given number exists
    public static void sieveOfEratosthenes(boolean[] dp, int maxNum) {
        Arrays.fill(dp, true);
        dp[0] = dp[1] = false;
//        Handling even cases
        for (int i = 2 * 2; i < maxNum; i += 2)
            dp[i] = false;
//        Handling odd cases
        for (int i = 3; i * i <= maxNum; i += 2) {
            if (dp[i]) {
                for (int j = i * i; j <= maxNum; j += i) {
                    dp[j] = false;
                }
            }
        }
    }

    public static void print_N_Primes(boolean[] dp, int num) {
        int cnt = 0;
        for (int i = 2; i < dp.length; i++) {
            if (dp[i] && cnt < num) {
                cnt++;
                if (cnt % 10 == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean[] dp = new boolean[1000001];
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sieveOfEratosthenes(dp, 1000000);
        print_N_Primes(dp, num);
    }
}
