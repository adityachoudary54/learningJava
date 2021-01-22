package com.company;

public class Ch5_Practice_PerfectNumber_Q33 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int sum = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
//                    System.out.println("Num and divisor:" + i + " " + j);
                    if (j == (int) i / j) {
                        sum += j;
                    } else {
                        sum += j;
                        sum += (int) i / j;
                    }
                }
            }
//            System.out.println(sum + " " + i);
            sum -= i;
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
