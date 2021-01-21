package com.company;

public class Ch4_Practice_GenerateVehiclePlateNumbers_Q25 {
    public static void main(String[] args) {
        String letter1 = (char) (Math.random() * 26 + 'A') + "";
        String letter2 = (char) (Math.random() * 26 + 'A') + "";
        String letter3 = (char) (Math.random() * 26 + 'A') + "";
        String num = String.format("%4d",(int)(Math.random()*9999)).replace(' ','0');
        System.out.println(letter1 + letter2 + letter3 + num);
    }
}