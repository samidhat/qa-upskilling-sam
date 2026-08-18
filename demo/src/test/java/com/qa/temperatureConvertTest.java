package com.qa;

import java.util.Scanner;

public class temperatureConvertTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double value = scanner.nextDouble();

        char unit = scanner.next().toUpperCase().charAt(0);

        temperatureConverter tc = new temperatureConverter(value);

        if (unit == 'C') {
            System.out.println(value + " C = " + tc.FarenheitConverter() + "F");
        } else if (unit == 'F') {
            System.out.println(value + " F = " + tc.celsiusConverter() + "C");
        } else {
            System.out.println("Invalid unit. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }
    }
}
