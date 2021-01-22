package com.company;

public class Ch5_Practice_NumDivBy5And6_Q10 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0){
                cnt++;
                if(cnt%10==0){
                    System.out.printf("%d\n",i);
                } else {
                    System.out.printf("%d ",i);
                }
            }
        }
    }
}
