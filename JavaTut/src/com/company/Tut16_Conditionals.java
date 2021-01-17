package com.company;

public class Tut16_Conditionals {
    public static void main(String[] args) {
//        Checking equality of conditionals the proper way
        double epsilon = 1E-14;
        double i = 1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        System.out.println(i);
        if (Math.abs(i - 0.5) < epsilon) {
            System.out.println("i==0.5");
        } else {
            System.out.println("i!=0.5");
        }
//        Generating random numbers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        System.out.println("Number1:" + number1);
        System.out.println("Number2:" + number2);
//        Switch case
        int num = (int) (Math.random() * 5 + 1);
//        Normal
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            case 4:
                System.out.println("Number is 4");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
//        enhanced
        switch (num) {
            case 1 -> System.out.println("Number is 1");
            case 2 -> System.out.println("Number is 2");
            case 3 -> System.out.println("Number is 3");
            case 4 -> System.out.println("Number is 4");
            case 5 -> System.out.println("Number is 5");
            default -> System.out.println("Wrong input");
        }
    }
}
