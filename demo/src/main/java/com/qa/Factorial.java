package com.qa;

import java.math.BigInteger;

public class Factorial {
    // Below code is for factorials ~20
    // public void fact(int num) {
    // long number = 1;
    // for (int i = 1; i <= num; i++) {
    // number = number * i;
    // }
    // System.out.println("The factorial of " + num + " is " + number);
    // }

    // Below code is for larger factorials value
    public void fact(int num) {
        BigInteger number = BigInteger.ONE; // start with 1
        for (int i = 1; i <= num; i++) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The factorial of " + num + " is " + number);
    }
}
