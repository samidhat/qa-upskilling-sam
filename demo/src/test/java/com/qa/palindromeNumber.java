package com.qa;

import java.util.Scanner;

public class palindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10; // Get last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            num = num / 10; // Remove last digit (numbers after decimal get removed)
        }

        if (original == reversed) {
            System.out.println("The Number is palindrome");
        } else {
            System.out.println("The Number is not a palindrome");
        }
        sc.close();
    }

}
