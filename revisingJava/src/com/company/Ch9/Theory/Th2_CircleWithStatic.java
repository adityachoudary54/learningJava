package com.company.Ch9.Theory;

class CircleWithStatic {
    double radius;
    static int numOfObjects;

    CircleWithStatic() {
        radius = 1;
        numOfObjects++;
    }

    CircleWithStatic(double radius) {
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

public class Th2_CircleWithStatic {
    public static void main(String[] args) {
        CircleWithStatic circle1 = new CircleWithStatic();
        CircleWithStatic circle2 = new CircleWithStatic();
        CircleWithStatic circle3 = new CircleWithStatic();
        CircleWithStatic circle4 = new CircleWithStatic();
        System.out.println(CircleWithStatic.getNumOfObjects());
        System.out.println(CircleWithStatic.numOfObjects);
    }
}
