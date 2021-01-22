package com.company;

public class Ch6_CaseStudy_PrimeNum {
    public static boolean isPrime(int num) {
        if (num % 2 == 0 && num != 2)
            return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int NUM_PRIMES = 50;
        int NUM_PRIMES_LINE = 10;
        int cnt = 1;
        int num = 2;
        while (cnt <= 50) {
            if (isPrime(num)) {
                if (cnt % 10 == 0)
                    System.out.printf("%3d\n", num);
                else
                    System.out.printf("%3d ", num);
                cnt++;
            }
            num++;
        }
    }
}
