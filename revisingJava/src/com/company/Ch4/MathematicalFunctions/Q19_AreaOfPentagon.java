package com.company.Ch4.MathematicalFunctions;

import java.util.Scanner;

public class Q19_AreaOfPentagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = Math.PI;
        double radius = sc.nextDouble();
        double s = 2 * radius * Math.sin(PI / 5);
        double area = (5 * s * s) / (4 * Math.tan(PI / 5));
        System.out.printf("Area of Pentagon with radius %.2f is:%.2f", radius, area);
    }
}
