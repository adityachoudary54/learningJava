package com.company.Ch6;

public class Q13_ComputeSeries {
    static double series(int cnt) {
        double sum = 0;
        for (int i = 1; i <= cnt; i++) {
            sum += (double) (i) / (i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%2d %10.4f\n", i, series(i));
        }
    }
}
