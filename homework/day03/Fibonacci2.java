package com.company;

import java.math.BigInteger;

public class Fibonacci2 {
    public static void main(String[] args) {
        System.out.println(fiboSolve("100"));
    }

    static BigInteger fiboSolve(String n) {
        BigInteger result = new BigInteger("0");
        BigInteger temp1 = new BigInteger("0");
        BigInteger temp2 = new BigInteger("1");

        for(int i = 0; i < Integer.parseInt(n); i++){
            temp1 = temp2;
            temp2 = result;
            result = temp1.add(temp2);
        }

        return result;
    }
}
