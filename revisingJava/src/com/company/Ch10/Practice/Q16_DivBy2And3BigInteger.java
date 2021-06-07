package com.company.Ch10.Practice;

import java.math.BigInteger;

public class Q16_DivBy2And3BigInteger {
    public static void main(String[] args) {
        BigInteger num = new BigInteger(String.valueOf("1" + "0".repeat(49)));
        int cnt = 0;
        while (cnt < 10) {
            if (num.remainder(new BigInteger("2")).equals(BigInteger.ZERO) || num.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(num + " " + num.remainder(new BigInteger("2")) + " " + num.remainder(new BigInteger("3")));
                cnt++;
            }
            num = num.add(BigInteger.ONE);
        }
    }
}
