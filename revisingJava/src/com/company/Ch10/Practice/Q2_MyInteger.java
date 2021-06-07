package com.company.Ch10.Practice;

import java.util.Objects;

class MyInteger {
    private int value;

    MyInteger(int value) {
        this.value = value;
    }

    MyInteger() {
        this(0);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value != 2 && value % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i * i <= value; i += 2) {
                if (value % i == 0)
                    return false;
            }
        }
        return true;
    }

    public boolean equals(int a) {
        return value == a;
    }

    public boolean equals(MyInteger a) {
        return value == a.getValue();
    }

    public static int parseInt(char[] chArr) {
        int res = 0;
        for (char c : chArr) {
            res *= 10;
            res += c - '0';
        }
        return res;
    }

    public static int parseInt(String str) {
        return parseInt(str.toCharArray());
    }
}

public class Q2_MyInteger {
    public static void main(String[] args) {
        MyInteger num = new MyInteger(10);
        System.out.println(num.getValue());
        System.out.println(num.isEven());
        System.out.println(num.isPrime());
        System.out.println(num.isOdd());
        System.out.println(num.equals(101));
        System.out.println(num.equals(new MyInteger(10)));
        num.setValue(97);
        System.out.println(num.getValue());
        System.out.println(num.isEven());
        System.out.println(num.isPrime());
        System.out.println(num.isOdd());
        System.out.println(num.equals(101));
        System.out.println(num.equals(new MyInteger(10)));
        System.out.println(MyInteger.parseInt(new char[]{'5', '1', '2', '3'}));
        System.out.println(MyInteger.parseInt("1354123"));
    }
}
