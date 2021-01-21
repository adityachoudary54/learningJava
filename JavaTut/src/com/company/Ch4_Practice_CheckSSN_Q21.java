package com.company;

import java.util.Scanner;

public class Ch4_Practice_CheckSSN_Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.charAt(3) == '-' && s.charAt(6) == '-'){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
