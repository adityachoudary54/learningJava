package com.company.Ch9.Practice;

class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0)
            return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        return 0;
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0)
            return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        return 0;
    }

}

public class Q10_QuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation quad = new QuadraticEquation(1, 2, 1);
        System.out.println(quad.getDiscriminant());
        System.out.println(quad.getRoot1());
        System.out.println(quad.getRoot2());
        quad.setA(1);
        quad.setB(4);
        quad.setC(2);
        System.out.println(quad.getDiscriminant());
        System.out.println(quad.getRoot1());
        System.out.println(quad.getRoot2());
    }

}
