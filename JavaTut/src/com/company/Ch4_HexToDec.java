package com.company;

import java.util.Scanner;

public class Ch4_HexToDec {
    public static void main(String[] args) {
        System.out.println("Enter a hex digit");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length()>1){
            System.out.println("Invalid input");
        } else if(Character.isDigit(s.charAt(0))){
            System.out.println(s);
        } else if(s.charAt(0)>='A' && s.charAt(0)<='F'){
            System.out.println(s.charAt(0)-'A'+10);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
