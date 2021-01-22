package com.company;

public class Ch5_Practice_HeadsOrTails_Q40 {
    public static void main(String[] args) {
        int heads = 0, tails = 0;
        for (int i = 0; i < 1000000; i++) {
            int headsOrTails = (int) (Math.random() * 1000000) % 2;
            heads += (headsOrTails == 0 ? 1 : 0);
            tails += (headsOrTails == 1 ? 1 : 0);
        }
        System.out.println("Heads:" + heads);
        System.out.println("Tails:" + tails);
    }
}
