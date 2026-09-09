package com.qa;

import java.util.Scanner;

public class PrimeCheckerTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        PrimeChecker pc = new PrimeChecker();
        boolean result = pc.isPrime(num);

        if (result) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        sc.close();
    }
}
