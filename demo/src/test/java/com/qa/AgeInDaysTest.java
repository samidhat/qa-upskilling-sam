package com.qa;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeInDaysTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter your birth year(YYYY): ");
        int year = sc.nextInt();
        System.out.println("Enter your birth month(MM): ");
        int month = sc.nextInt();
        System.out.println("Enter your birth day(DD): ");
        int day = sc.nextInt();

        // Create LocalDate objects
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        // Calculate age in days using ChronoUnit
        long ageInDays = ChronoUnit.DAYS.between(birthDate, currentDate);

        System.out.println("Your age in days is: " + ageInDays);
        
        sc.close();
    }
}
