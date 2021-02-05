package com.company;

public class Ch7_CaseStudy_DeckOfCards {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            int num = (int) (Math.random() * 52);
            arr[i] = num;
        }
        for (int item : arr) {
            System.out.println("Suit is:" + suits[item / 13] + " and Rank is:" + ranks[item % 13]);
        }
    }
}
