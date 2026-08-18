package com.qa;

public class SimpleInterest {

    double p;
    double r;
    double t;

    public SimpleInterest(double p, double r, double t) {
        this.p = p;
        this.r = r;
        this.t = t;
    }

    public double simpleInterest() {
        return (p * r * t) / 100;
    }
}
