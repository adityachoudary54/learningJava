// Area of Pentagon
package com.company;

import java.util.Scanner;

public class Ch4_Practice_AreaOfPentagon_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length from center of pentagon:");
        double r = sc.nextDouble();
        double s = 2*r*Math.sin(Math.PI/5);
        double area = (5*s*s)/(4*Math.tan(Math.PI/5));
        System.out.printf("Area of polygon is:%.2f",area);
    }
}
