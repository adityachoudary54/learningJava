package com.company;

public class Ch5_CaseStudy_PrimeNumbers {
    public static void main(String[] args) {
        int num_of_primes = 25;
        int num_of_primes_in_line = 5;
        int number = 2;
        int cnt = 0;
        while (cnt < num_of_primes) {
            boolean isPrime = true;
            if (number % 2 == 0 && number != 2) {
                isPrime = false;
            } else {
                for (int i = 3; i * i <= number; i += 2) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                cnt++;
                if (cnt % num_of_primes_in_line == 0) {
                    System.out.print(number + "\n");
                } else {
                    System.out.print(number + " ");
                }
            }
            number++;
        }
    }
}
