package com.company;

public class Ch4_Theory_MathFunc {
    public static void main(String[] args) {
//        Common methods
        System.out.println("Common methods\n");
        int a = 2, b = 7;
        System.out.println("Max of 2 and 7 is:" + Math.max(a, b));
        System.out.println("Min of 2 and 7 is:" + Math.min(a, b));
        System.out.println("Random number between 0.0 and 1.0 is:" + Math.random());
        System.out.println("2^4 is:"+Math.pow(2,4));
        System.out.println("abs(-24):"+Math.abs(-24));
//        Trignometric methods
        System.out.println("\nTrignometric methods\n");
        final double PI = Math.PI;
        System.out.println("60 degree equals "+Math.toRadians(60)+" radians");
        System.out.println("PI/4 radians equals "+Math.toDegrees(PI/4)+" degrees");
        System.out.println("sin(PI/6):"+Math.sin(PI/6));
        System.out.println("cos(PI/6):"+Math.cos(PI/6));
        System.out.println("tan(PI/3):"+Math.tan(PI/3));
//        Exponent methods
        System.out.println("\nExponent methods\n");
        final double E=Math.E;
        System.out.println("e^2:"+Math.exp(2));
        System.out.println("log(e^2):"+Math.log(Math.exp(2)));
        System.out.println("log10(100):"+Math.log10(100));
        System.out.println("6^3:"+Math.pow(6,3));
        System.out.println("sqrt(9):"+Math.sqrt(9));
//        Rounding methods
        System.out.println("\nRounding methods\n");
//        ceil(x)
        System.out.println("ceil(2.1):"+Math.ceil(2.1));
        System.out.println("ceil(2):"+Math.ceil(2));
//        floor(x)
        System.out.println("floor(2.1):"+Math.floor(2.1));
        System.out.println("floor(2):"+Math.floor(2));

    }
}
