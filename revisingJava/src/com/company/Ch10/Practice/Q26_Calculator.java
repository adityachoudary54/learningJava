package com.company.Ch10.Practice;

import java.util.Arrays;

public class Q26_Calculator {
    public static char returnOpr(String str) {
        String[] oprs = {"+", "-", "*", "/"};
        for (String ch : oprs) {
            if (str.contains(ch))
                return ch.charAt(0);
        }
        return '0';
    }

    public static void main(String[] args) {
        String[] temp = args[0].split("[+*-/]");
//        System.out.println(Arrays.toString(temp));
        int op1 = Integer.parseInt(temp[0].trim());
        int op2 = Integer.parseInt(temp[1].trim());
        char opr;
        opr = returnOpr(args[0]);
        switch (opr) {
            case '+' -> System.out.printf("%d %c %d = %d", op1, opr, op2, op1 + op2);
            case '-' -> System.out.printf("%d %c %d = %d", op1, opr, op2, op1 - op2);
            case '*' -> System.out.printf("%d %c %d = %d", op1, opr, op2, op1 * op2);
            case '/' -> System.out.printf("%d %c %d = %d", op1, opr, op2, op1 / op2);
            default -> System.out.println("Invalid operation");
        }
    }
}
