package com.company;

import java.util.Scanner;

public class Ch3_Q12_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0,j=s.length()-1; i <= s.length()/2 ; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println("Not Palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");
    }
}
