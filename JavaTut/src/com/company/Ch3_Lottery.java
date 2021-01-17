package com.company;

import java.util.Scanner;

public class Ch3_Lottery {
    public static void main(String[] args) {
//        2 digit number
        int lottery = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int revUserInput = (userInput%10)*10 + (userInput/10);
        System.out.println(lottery);
        if(userInput == lottery){
            System.out.println("You won $10,000");
        } else if(revUserInput == lottery){
            System.out.println("You won $3,000");
        } else if((lottery%10 == userInput%10 || lottery%10 == userInput/10) || (lottery/10 == userInput%10 || lottery/10 == userInput/10)){
            System.out.println("You won $1,000");
        } else {
            System.out.println("Thenga number is:"+lottery);
        }
    }
}
