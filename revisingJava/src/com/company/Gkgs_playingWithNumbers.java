package com.company;

import java.util.Scanner;

public class Gkgs_playingWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while((t--)>0){
            sc = new Scanner(System.in);
            String num = sc.nextLine();
            switch (num.length()){
                case 10:
                    boolean res = num.charAt(0) =='7' || num.charAt(0) =='8' || num.charAt(0) =='9';
                    String s = res?"Valid":"Invalid";
                    System.out.println(s);
                    break;
                case 11:
                    res = num.charAt(1) =='7' || num.charAt(1) =='8' || num.charAt(1) =='9' || num.charAt(0) =='0';
                    s = res?"Valid":"Invalid";
                    System.out.println(s);
                    break;
                case 12:
                    res = num.charAt(2) =='7' || num.charAt(2) =='8' || num.charAt(2) =='9' || num.substring(0,2) =="91";
                    s = res?"Valid":"Invalid";
                    System.out.println(s);
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
