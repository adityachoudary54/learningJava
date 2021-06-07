package com.company.Ch10.Practice;

class MyStringBuilder1 {
    private char[] buffer;

    public char[] getBuffer() {
        return buffer;
    }

    public void setBuffer(char[] buffer) {
        this.buffer = buffer;
    }

    public MyStringBuilder1(char[] chars) {
        buffer = new char[chars.length];
        System.arraycopy(chars, 0, buffer, 0, chars.length);
    }

    public MyStringBuilder1(String s) {
        this(s.toCharArray());
    }

    public String toString() {
        return new String(buffer);
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        return new MyStringBuilder1(toString() + s);
    }

    public MyStringBuilder1 append(int i) {
        String temp = "";
        while (i > 0) {
            temp = i % 10 + temp;
            i /= 10;
        }
        return new MyStringBuilder1(toString() + temp);
    }
}

public class Q27_MyStringBuilder1 {
    public static void main(String[] args) {
        MyStringBuilder1 str = new MyStringBuilder1("Hello world");
        System.out.println(str.append(1234).toString());
    }
}
