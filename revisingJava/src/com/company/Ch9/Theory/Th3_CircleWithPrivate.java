package com.company.Ch9.Theory;
class CircleWithPrivate {
    private double radius;
    private static int numOfObjects;

    CircleWithPrivate() {
        radius = 1;
        numOfObjects++;
    }

    CircleWithPrivate(double radius) {
        this.radius = radius;
        numOfObjects++;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    static int getNumOfObjects() {
        return numOfObjects;
    }
}
public class Th3_CircleWithPrivate {
}
