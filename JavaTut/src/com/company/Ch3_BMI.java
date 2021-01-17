package com.company;

import java.util.Scanner;

public class Ch3_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the BMI:");
        double bmi = sc.nextDouble();
//        Lengthy way
//        if (bmi < 18.5) {
//            System.out.println("Underweight");
//        } else if(bmi >=18.5 && bmi< 25.0){
//            System.out.println("Normal");
//        } else if(bmi >=25.0 && bmi< 30.0){
//            System.out.println("Overweight");
//        } else if(bmi >=30.0){
//            System.out.println("Obese");
//        }
//        Easy way
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if(bmi< 25.0){
            System.out.println("Normal");
        } else if(bmi< 30.0){
            System.out.println("Overweight");
        } else if(bmi >=30.0){
            System.out.println("Obese");
        }
    }
}
