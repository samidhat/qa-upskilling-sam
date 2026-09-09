package com.qa;

public class PrimeChecker {

    public boolean isPrime(int num) {
        boolean isPrimeFlag = true;

        if (num <= 1) {
            isPrimeFlag = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrimeFlag = false;
                    break;
                }
            }
        }
        return isPrimeFlag;
    }
}
