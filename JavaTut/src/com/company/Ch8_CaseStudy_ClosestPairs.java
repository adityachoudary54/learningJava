package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ch8_CaseStudy_ClosestPairs {
    public static double distance(double[] pair1, double[] pair2) {
        return Math.sqrt(Math.pow((pair1[0] - pair2[0]), 2) + Math.pow((pair1[1] - pair2[1]), 2));
    }

    public static String closestPairs(double[][] pairList) {
        int res1 = 0;
        int res2 = 0;
        double dist = Integer.MAX_VALUE;
        for (int i = 0; i < pairList.length; i++) {
            for (int j = i + 1; j < pairList.length; j++) {
                double temp = distance(pairList[i], pairList[j]);
                if (dist > temp) {
                    dist = temp;
                    res1 = i;
                    res2 = j;
                }
            }
        }
//        System.out.println(dist);
        return Arrays.toString(pairList[res1]) + " & " + Arrays.toString(pairList[res2]);
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pairs:");
        num = sc.nextInt();
        System.out.println("Enter the pairs");
        double[][] pairs = new double[num][2];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter pair " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                pairs[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Closest pairs are:" + closestPairs(pairs));

    }
}
