package com.company;

import java.util.Scanner;

public class Tut6_calc {
    public static void main(String[] args) {
        int eng,maths,sci,sst,sans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Eng:");
        eng = sc.nextInt();
        System.out.println("Enter the marks of maths:");
        maths = sc.nextInt();
        System.out.println("Enter the marks of sci:");
        sci = sc.nextInt();
        System.out.println("Enter the marks of sst:");
        sst = sc.nextInt();
        System.out.println("Enter the marks of sans:");
        sans = sc.nextInt();
        float res = (eng+maths+sci+sst+sans)/5f;
        System.out.printf("The percentage is:%.4f\n",res);
    }
}
