package com.company;

import java.util.Scanner;

public class Ch6_Theory_voidMethodEg {
    public static void grade(double marks) {
        if (marks > 90) {
            System.out.println("O");
        } else if (marks > 81) {
            System.out.println("A+");
        } else if (marks > 72) {
            System.out.println("A");
        } else if (marks > 63) {
            System.out.println("B+");
        } else if (marks > 54) {
            System.out.println("B");
        } else if (marks > 45) {
            System.out.println("C");
        } else if (marks > 40) {
            System.out.println("P");
        } else {
            System.out.println("F");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            input = sc.nextLine();
            if (!input.equals("end")) {
                grade(Double.parseDouble(input));
            }
        } while (!input.equals("end"));
    }
}
