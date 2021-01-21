package com.company;

import java.util.Scanner;

public class Ch4_Practice_StudentMajorStatus_Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String res = "";

        switch (input.charAt(0)){
            case 'M' -> res+="Mathematics ";
            case 'C' -> res+="Computer Science ";
            case 'I' -> res+="Information Technology ";
        }
        switch (input.charAt(1)){
            case '1' -> res+="Freshman";
            case '2' -> res+="Sophomore";
            case '3' -> res+="Junior";
            case '4' -> res+="Senior";
        }
        System.out.println(res);
    }
}
