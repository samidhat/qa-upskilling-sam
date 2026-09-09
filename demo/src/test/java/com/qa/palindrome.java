package com.qa;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String input = sc.nextLine();

        // Remove the spaces and convert to lowercase
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // reverse the string using StringBuilder
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Check is palindrome
        if (reversed.equals(cleaned)) {
            System.out.println("The String is palindrome");
        } else {
            System.out.println("The String is not a palindrome");
        }
        sc.close();

    }
}
