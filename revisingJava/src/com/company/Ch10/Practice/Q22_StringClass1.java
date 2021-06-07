package com.company.Ch10.Practice;

import java.util.Arrays;
import java.util.Locale;

class MyString1 {
    private String str;

    MyString1(char[] chars) {
        str = new String(chars);
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    MyString1(String str) {
        this.str = str;
    }

    public char charAt(int index) {
        return str.charAt(index);
    }

    public int length() {
        return str.length();
    }

    public MyString1 substring(int begin, int end) {
        char[] temp = new char[end - begin];
        for (int cnt = 0, i = begin; i < end; i++, cnt++) {
            temp[cnt] = str.charAt(i);
        }
        return new MyString1(new String(temp));
    }

    public MyString1 toLowerCase() {
        return new MyString1(str.toLowerCase());
    }

    public boolean equals(MyString1 s) {
        return str.equals(s.getStr());
    }

    public static MyString1 valueOf(int i) {
        return new MyString1(i + "");
    }
}

public class Q22_StringClass1 {
    public static void main(String[] args) {
        MyString1 str1 = new MyString1("Hello World");
        MyString1 str2 = new MyString1("Welcome to a new beginning");
        System.out.println("char at index 2 is:" + str1.charAt(2));
        System.out.println("length is:" + str1.length());
        System.out.println("substring between index 2 to 4 is:" + str1.substring(2, 4).getStr());
        System.out.println("lowercase version is:" + str1.toLowerCase().getStr());
        System.out.println("is str1 and str2 equal?:" + str1.equals(str2));
        System.out.println("String version of 1234 is:" + MyString1.valueOf(1234).getStr());
    }
}
