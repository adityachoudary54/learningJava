package com.company.Ch2;

import java.util.Scanner;

class Point {
    double x;
    double y;

//    Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
}

public class AreaOfTriangle_excerciseQ19 {
    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    private static double area(double s1, double s2, double s3) {
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point[] points = new Point[3];
        for (int i = 0; i < 3; i++) {
            points[i] = new Point();
            points[i].x = sc.nextDouble();
            points[i].y = sc.nextDouble();
        }
        double s1, s2, s3;
        s1 = distance(points[0].x, points[0].y, points[1].x, points[1].y);
        s2 = distance(points[1].x, points[1].y, points[2].x, points[2].y);
        s3 = distance(points[0].x, points[0].y, points[2].x, points[2].y);
        System.out.println("Area is:" + area(s1, s2, s3));
    }
}
