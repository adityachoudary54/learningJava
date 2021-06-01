package com.company.Ch3;

import java.util.Scanner;

class LinearEquation {
    double a, b, c;

    LinearEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void printEqn() {
        System.out.printf("(%.2f,%.2f,%.2f)", a, b, c);
    }
}

public class SolvingLinearEquation_theory {
    private static String solve(LinearEquation[] eqns) {
        double denominator = eqns[0].a * eqns[1].b - eqns[1].a * eqns[0].b;
        if (denominator == 0) {
            return "No solution exists";
        } else {
            double root1 = (eqns[0].c * eqns[1].b - eqns[1].c * eqns[0].b) / denominator;
            double root2 = (eqns[0].a * eqns[1].c - eqns[1].a * eqns[0].c) / denominator;
            return String.format("(%.2f,%.2f)", root1, root2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearEquation[] eqns = new LinearEquation[2];
        for (int i = 0; i < 2; i++) {
            double a, b, c;
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            eqns[i] = new LinearEquation(a, b, c);
//            eqns[i].printEqn();
        }
        String ans = solve(eqns);
        if (ans.charAt(0) == 'N') {
            System.out.println(ans);
        } else {
            System.out.println("Roots are:" + ans);
        }
    }
}
