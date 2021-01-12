package com.company;
// java.util.Scanner is imported to use Scanner class
import java.util.Scanner;

public class Tut5_takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer:");
        int i = sc.nextInt();
        System.out.print("Enter a float:");
        float f = sc.nextFloat();
        System.out.println("The sum of integer and float is:"+(i+f));

//        hasNextInt
        boolean b = sc.hasNextInt();
        System.out.println("Is next value Integer?(true/false):"+b);

//        Taking string input
//        Taking single word
        sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = sc.next();
        System.out.println("The string is:"+s);
        System.out.print("Enter a string:");
        sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println("The new string is:"+s);
    }
}
