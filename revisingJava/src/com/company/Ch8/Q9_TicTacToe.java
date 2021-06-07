package com.company.Ch8;

import java.util.Arrays;
import java.util.Scanner;

public class Q9_TicTacToe {

    public static int check(char[][] mat) {
//        Row check
        for (char[] chars : mat) {
            char symbol = chars[0];
            int j;
            for (j = 1; j < mat[0].length; j++) {
                if (symbol != chars[j])
                    break;
            }
            if (j == mat[0].length && symbol != '_') {
                if (symbol == 'X')
                    return 1;
                else
                    return 2;
            }
        }

//        Col check
        for (int j = 0; j < mat[0].length; j++) {
            char symbol = mat[0][j];
            int i;
            for (i = 1; i < mat.length; i++) {
                if (symbol != mat[i][j])
                    break;
            }
            if (i == mat.length && symbol != '_') {
                if (symbol == 'X')
                    return 1;
                else
                    return 2;
            }
        }

//        Diagonal check
//        Diagonal 1
        char symbol = mat[0][0];
        int i;
        for (i = 1; i < mat.length; i++) {
            if (symbol != mat[i][i])
                break;
        }
        if (i == mat.length && symbol != '_') {
            if (symbol == 'X')
                return 1;
            else
                return 2;
        }

//        Diagonal 2
        symbol = mat[0][2];
        for (i = 1; i < mat.length; i++) {
            if (symbol != mat[i][2 - i])
                break;
        }
        if (i == mat.length && symbol != '_') {
            if (symbol == 'X')
                return 1;
            else
                return 2;
        }
//        If no one wins
        return 0;
    }

    public static void inputMat(char[][] mat) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = str.charAt(j);
            }
        }
    }

    public static void printMat(char[][] mat) {
        for (char[] row : mat) {
            for (char item : row) {
                System.out.print(item);
            }
            System.out.println("");
        }
    }

    public static void inputPos(char[][] mat, char symbol) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        i = sc.nextInt();
        j = sc.nextInt();
        mat[i][j] = symbol;
    }

    public static void main(String[] args) {
        char[][] mat = new char[3][3];
//        inputMat(mat);
//        printMat(mat);
//        System.out.println(check(mat));
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = '_';
            }
        }
        boolean flag = true;
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("Player 1 enter position");
                inputPos(mat, 'X');
            } else {
                System.out.println("Player 2 enter position");
                inputPos(mat, 'O');
            }
            System.out.println("Status " + i);
            if (check(mat) == 1) {
                System.out.println("Player 1 won");
                printMat(mat);
                flag = false;
                break;
            } else if (check(mat) == 2) {
                System.out.println("Player 2 won");
                printMat(mat);
                flag = false;
                break;
            } else {
                printMat(mat);
            }
        }
        if (flag) {
            System.out.println("Match Draw");
        }
    }
}


