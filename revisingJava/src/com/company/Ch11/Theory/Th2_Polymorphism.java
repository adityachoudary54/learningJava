package com.company.Ch11.Theory;

import java.util.Date;

class Vehicle {
    private String color;
    private Date createdDate;
    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle() {
        this("white", "Fuljhari");
    }

    public Vehicle(String color, String name) {
        this.color = color;
        this.name = name;
        this.createdDate = new Date();
    }

    @Override
    public String toString() {
        return String.format("Vehicle with name:%s and color:%s was manufactured on:%s", name, color, createdDate);
    }
}

class Car extends Vehicle {
    String model;

    public Car(String color, String name, String model) {
        super(color, name);
        this.model = model;
    }

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}

class Bus extends Vehicle {
    String model;

    public Bus(String color, String name, String model) {
        super(color, name);
        this.model = model;
    }

    public Bus(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                '}';
    }
}

public class Th2_Polymorphism {
    public static void main(String[] args) {
        Vehicle v;
        v = new Vehicle();
        System.out.println(v.toString());
        v = new Car("Buggati");
        System.out.println(v.toString());
        v = new Bus("Bkwas");
        System.out.println(v.toString());

    }
}
