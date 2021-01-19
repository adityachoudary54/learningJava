package com.company;

import java.util.Scanner;

public class Ch4_Practice_DecToHex_Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal:");
        String dec = sc.nextLine();
        if(dec.length()>2 || Integer.parseInt(dec)>15){
            System.out.println("Invalid input");
        } else if(Integer.parseInt(dec)<10){
            System.out.println(dec);
        } else {
            System.out.println((char)('A'+ Integer.parseInt(dec) - 10));
        }
    }
}
