package com.qa;

import java.util.Scanner;

public class FactorialTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();

        Factorial fc = new Factorial();
        fc.fact(num);
        sc.close();
    }

}
