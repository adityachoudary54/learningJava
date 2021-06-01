package com.company.Ch2;

public class RoundOfErrors_theory {
    public static void main(String[] args) {
//        show 0.7000000000000001 not 0.7 so be carfefull
//        when dealing with floats and double
        System.out.println(1 - 0.1 - 0.1 - 0.1);
        float a = 1.0f;
        float b = 2.0f;
        if (((1 - 0.1 - 0.1 - 0.1) - 0.7) < 1e-12) {
            System.out.println("Correct");
        }
    }
}
