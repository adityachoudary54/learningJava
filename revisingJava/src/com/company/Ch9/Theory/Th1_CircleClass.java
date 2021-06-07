package com.company.Ch9.Theory;

class Circle {
    double radius;

    Circle() {
        radius = 1;
    }

    Circle(double radius) {
        this.radius = radius;
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
}

public class Th1_CircleClass {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.radius);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        Circle circle2 = new Circle(10);
        System.out.println(circle2.radius);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());
        circle2.setRadius(3);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());
    }
}
