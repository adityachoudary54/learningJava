package com.company;

import java.util.Scanner;

public class Ch3_Q11_NumDaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, year;
        System.out.println("Enter the month:");
        month = sc.nextInt();
        System.out.println("Enter the year:");
        year = sc.nextInt();
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year%400 == 0)){
                System.out.println("29");
            } else {
                System.out.println("28");
            }
        } else {
            switch (month){
                case 1,3,5,7,8,10,12 -> System.out.println("31");
                case 4,6,9,11 -> System.out.println("30");
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
