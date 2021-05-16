package com.company;

public class Tut13_14_Strings {
    public static void main(String[] args) {
        String s = "Aditya";
        System.out.println(s.length());
//        Modifier methods
        System.out.println("Modifier methods results");
//        lowercase and uppercase
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
//        trim
        s = "       Aditya       ";
        System.out.printf("before trim:%s, after trim:%s\n", s, s.trim());
//        substring
        s = "Aditya";
        System.out.println(s.substring(3));
        System.out.println(s.substring(1, 4));
//        replace
        s = "replace";
        System.out.printf("before replace:%s, after replace:%s\n", s, s.replace("r", "p"));


//        Checking and informing methods
        System.out.println("Checking and informing methods results");
//        startswith & endswith
        s = "Aditya";
        System.out.printf("startswith(Ad) is:%b\n",s.startsWith("Ad"));
        System.out.printf("endswith(Ad) is:%b\n",s.endsWith("Ad"));
//        charAt
        s = "Aditya";
        System.out.println(s.charAt(4));
//        indexOf and lastIndexOf
        s = "Adityadit";
        System.out.println(s.indexOf("dit"));
        System.out.println(s.indexOf("dit",1));
        System.out.println(s.lastIndexOf("dit"));
        System.out.println(s.lastIndexOf("dit",6));
//        equals and equalsIgnoreCase
        s = "Aditya";
        System.out.println(s.equals("aditya"));
        System.out.println(s.equalsIgnoreCase("aditya"));
    }
}
