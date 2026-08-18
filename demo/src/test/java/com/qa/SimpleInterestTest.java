package com.qa;

public class SimpleInterestTest {

    public static void main(String[] args) {
        SimpleInterest st = new SimpleInterest(20000, 0.02, 2);
        System.out.println("The calculated simple interest is: " + st.simpleInterest());
    }
}
