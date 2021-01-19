package com.company;

import java.util.Scanner;

public class Ch4_Practice_CornerPointCoordinates_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        double radius = sc.nextDouble();
        double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;
        x1 = radius * Math.cos(Math.PI / 2);
        y1 = radius * Math.sin(Math.PI / 2);

        x2 = radius * Math.cos(Math.PI / 2 + (2 * Math.PI / 5));
        y2 = radius * Math.sin(Math.PI / 2 + (2 * Math.PI / 5));

        x3 = radius * Math.cos(Math.PI / 2 + 2 * (2 * Math.PI / 5));
        y3 = radius * Math.sin(Math.PI / 2 + 2 * (2 * Math.PI / 5));

        x4 = radius * Math.cos(Math.PI / 2 + 3 * (2 * Math.PI / 5));
        y4 = radius * Math.sin(Math.PI / 2 + 3 * (2 * Math.PI / 5));

        x5 = radius * Math.cos(Math.PI / 2 + 4 * (2 * Math.PI / 5));
        y5 = radius * Math.sin(Math.PI / 2 + 4 * (2 * Math.PI / 5));

        System.out.println("The coordinates are");
        System.out.printf("(%f,%f)\n", x1, y1);
        System.out.printf("(%f,%f)\n", x2, y2);
        System.out.printf("(%f,%f)\n", x3, y3);
        System.out.printf("(%f,%f)\n", x4, y4);
        System.out.printf("(%f,%f)\n", x5, y5);
    }
}
