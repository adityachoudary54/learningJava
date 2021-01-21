package com.company;

import java.util.Scanner;

public class Ch4_Practice_OrderThreeCities_Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        String minStr = s1.compareTo(s2) < 0 ? s1 : s2;
        minStr = minStr.compareTo(s3) < 0 ? minStr : s3;
        System.out.println(minStr);

        String maxStr = s1.compareTo(s2) > 0 ? s1 : s2;
        maxStr = maxStr.compareTo(s3) > 0 ? maxStr : s3;
        System.out.println(maxStr);

        String midStr = s1 + s2 + s3;
        midStr = midStr.replace(minStr, "");
        midStr = midStr.replace(maxStr, "");
        System.out.printf("%s\t%s\t%s", minStr, midStr, maxStr);
    }
}
