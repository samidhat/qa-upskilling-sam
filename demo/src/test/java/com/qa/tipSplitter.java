package com.qa;

import java.util.Scanner;

public class tipSplitter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter total bill amount");
        double billAmt = sc.nextDouble();

        System.out.println("Enter total tip amount");
        double tipAmt = sc.nextDouble();

        System.out.println("Enter total number of person ");
        int totalPerson = sc.nextInt();

        double totalBill = billAmt + tipAmt;
        double perPersonCharge = totalBill / totalPerson;

        System.out.println("per person contribution in the bill is: " + perPersonCharge);

        sc.close();

    }
}
