package com.company;

import java.util.Scanner;

public class Ch4_GuessingBirthday {
    public static void main(String[] args) {
        String s1 = "1 3 5 7\n" +
                    "9 11 13 15\n" +
                    "17 19 21 23\n" +
                    "25 27 29 31\n";
        String s2 = "2 3 6 7\n" +
                    "10 11 14 15\n" +
                    "18 19 22 23\n" +
                    "26 27 30 31\n";
        String s3 = "4 5 6 7\n" +
                    "12 13 14 15\n" +
                    "20 21 22 23\n" +
                    "28 29 30 31\n";
        String s4 = "8 9 10 11\n" +
                    "12 13 14 15\n" +
                    "24 25 26 27\n" +
                    "28 29 30 31\n";
        String s5 = "16 17 18 19\n" +
                    "20 21 22 23\n" +
                    "24 25 26 27\n" +
                    "28 29 30 31\n";

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        if(s1.contains(num + "")){
            res += Integer.parseInt(s1.split(" ")[0]);
        }
        if(s2.contains(num + "")){
            res += Integer.parseInt(s2.split(" ")[0]);
        }
        if(s3.contains(num + "")){
            res += Integer.parseInt(s3.split(" ")[0]);
        }
        if(s4.contains(num + "")){
            res += Integer.parseInt(s4.split(" ")[0]);
        }
        if(s5.contains(num + "")){
            res += Integer.parseInt(s5.split(" ")[0]);
        }
        System.out.println("Your number is:"+res);
    }
}
