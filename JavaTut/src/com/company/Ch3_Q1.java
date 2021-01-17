// Roots of the Equation
package com.company;

import java.util.Scanner;

public class Ch3_Q1 {
    public static void main(String[] args) {
        System.out.print("Enter the values of a,b,c in ax^2 + bx + c:");
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Given equation has no real roots");
        } else if (discriminant == 0) {
            System.out.println("Equal roots which is:" + (-b / (2 * a)));
        } else {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.printf("Roots are:%f and %f\n", root1, root2);
        }
    }
}
