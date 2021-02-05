package com.company;

public class Ch7_CaseStudy_CountingOccurencesOfEachLetter {
    public static void main(String[] args) {
        char[] arr = new char[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ((int) (Math.random() * 26) + 'a');
        }
        int[] counts = new int[26];
        for (int item : arr) {
            counts[item - 'a']++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Count of " + (char) (i + 'a') + " is:" + counts[i]);
        }
    }
}
