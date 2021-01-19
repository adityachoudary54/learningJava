package com.company;

import java.util.Scanner;

public class Ch4_StringFunc {
    public static void main(String[] args) {
//        String to int
//        System.out.println("String to int\n");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a string:");
//        String s = sc.nextLine();
//        int sToInt = Integer.valueOf(s);
//        System.out.println(sToInt + 10);
//
//        int to String
//        System.out.println("\nint to String\n");
//        System.out.println("Enter an integer:");
//        int a = sc.nextInt();
//        String aToString = String.valueOf(a);
//        System.out.println(aToString + "HelloWorld");

//        Simple methods
        String s = "Aditya";
        System.out.println("\nSimple string methods\n");
        System.out.printf("Length of string \"aditya\" is:%d\n", "aditya".length());
        System.out.println("s.charAt(3):" + s.charAt(3));
        System.out.println("s.toUpperCase()" + s.toUpperCase());
        System.out.println("s.toLowerCase()" + s.toLowerCase());
        s = "     Aditya          ";
        System.out.println("s.trim():"+s.trim());

//        Comparison methods
//        "==" points to reference comparison in string
//        a.equals(b) points to content comparison for string
        System.out.println("\nComparision Methods\n");
        System.out.println("Aditya".equals("aditya"));
        System.out.println("Aditya".equalsIgnoreCase("aditya"));

//        compareTo works according to asci values
//        -ve
        System.out.println("Aditya".compareTo("Bditya"));
//        0
        System.out.println("Aditya".compareTo("Aditya"));
//        +ve
        System.out.println("Bditya".compareTo("Aditya"));

        System.out.println("Aditya".compareToIgnoreCase("bditya"));
        s = "Aditya Choudhary";

        System.out.println("s.startsWith(\"Adi\"):"+s.startsWith("Adi"));
        System.out.println("s.endsWith(\"ary\"):"+s.endsWith("ary"));

        System.out.println("s.contains(\"a C\"):"+s.contains("a C"));

//        substring
        s = "Aditya Choudhary is great";
        System.out.println("s.substring(3):"+s.substring(3));
        System.out.println("s.substring(3,9):"+s.substring(3,9));

//        Finding character or a substring
        s = "Aditya Choudhary is great.";
        System.out.println("s.indexOf('y'):"+s.indexOf('y'));
        System.out.println("s.indexOf('y',6):"+s.indexOf('y',6));
        System.out.println("s.indexOf(\"ya\"):"+s.indexOf("ya"));
        System.out.println("s.indexOf(\"ya\",6):"+s.indexOf("ya",6));

        System.out.println("s.lastIndexOf('y'):"+s.lastIndexOf('y'));
        System.out.println("s.lastIndexOf('y',6):"+s.lastIndexOf('y',6));
        System.out.println("s.lastIndexOf(\"ya\"):"+s.lastIndexOf("ya"));
        System.out.println("s.lastIndexOf(\"ya\",6):"+s.lastIndexOf("ya",6));

//        Conversion between strings and integers
        System.out.println("\nConversions between Strings and Integers\n");
//        String to int
        int intValue = Integer.parseInt("28");
        System.out.println(intValue);
//        int to String
        String sValue = 28 + "";
        System.out.println(sValue);

    }
}
