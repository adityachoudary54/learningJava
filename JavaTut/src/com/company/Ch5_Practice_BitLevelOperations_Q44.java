package com.company;

import java.util.Scanner;

public class Ch5_Practice_BitLevelOperations_Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res = "";
        if (num < 0) {
            res = Integer.toBinaryString(num);
            String temp = res.substring(0, res.length() - 16);
            if (temp.length() > 0) {
                res = res.replaceFirst(temp, "");
            }
        } else {
            res = Integer.toBinaryString(num);
            String temp = res;
            for (int i = 0; i < (16 - temp.length()); i++) {
                res = '0' + res;
            }
        }
        System.out.println("The bit are:" + res);
    }
}
