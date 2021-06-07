package com.company.Ch11.Theory;

import java.util.Date;

class Geometry {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Geometry(String color, boolean filled, Date dateCreated) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }

    public Geometry(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public Geometry() {
        this("white", false, new Date());
    }

    public String toString() {
        return "Geometry{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}

class CircleFromGeometry extends Geometry {
    private double radius;
    private final double PI = Math.PI;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public CircleFromGeometry(String color, boolean filled, Date dateCreated, int radius) {
        super(color, filled, dateCreated);
        this.radius = radius;
    }

    public CircleFromGeometry(String color, boolean filled, Date dateCreated) {
        super(color, filled, dateCreated);
        radius = 1;
    }

    public CircleFromGeometry(int radius) {
        this.radius = radius;
    }

    public CircleFromGeometry(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public CircleFromGeometry() {
        radius = 1;
    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public void circleInfo() {
        System.out.println(this.toString());
        System.out.println("This shape is a circle with radius:" + radius);
    }

    //    Overriding methods
    @Override
    public String toString() {
        return (super.toString()) + "\nCircle {" +
                "radius:" + radius +
                "}";
    }

}

public class Th1_Geometry {
    public static void main(String[] args) {
        CircleFromGeometry circle = new CircleFromGeometry();
//        circle.circleInfo();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.toString());
    }
}
