package com.company;

import java.util.Scanner;

public class Ch5_CaseStudy_CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = 0, j = input.length() - 1; i < input.length() ;
        i++, j--){
            if(input.charAt(i)!=input.charAt(j)){
                System.out.println("Not Palindrome");
                System.exit(1);
            }
        }
        System.out.println("Palindrome");
    }
}
