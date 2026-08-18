package com.qa;

public class BMICalculator {
    int weightKG;
    double heightCM;
    double bmiValue;

    public BMICalculator(int weight, double height){
    this.weightKG = weight;
    this.heightCM = (height/100);
    }

    public void bmi(){
    bmiValue = weightKG/(heightCM*heightCM);
    System.out.println("The bmiValue is: " +bmiValue);
    }

}
