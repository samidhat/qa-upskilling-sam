package com.qa;

import java.util.Scanner;

public class palindromeLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String input = sc.nextLine();

        // Remove the spaces and convert to lowercase
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        int length = cleaned.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }

        }
        // Check is palindrome
        if (isPalindrome) {
            System.out.println("The String is palindrome");
        } else {
            System.out.println("The String is not a palindrome");
        }
        sc.close();
    }
}
