package com.codedifferently.lab.calc2;

public class Calculator2 {
    public static double tax = .05;
    public static double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0.0;

    public static void findTotal(double price) {
        //Calculate an individual's total after tax and tip
        //Print this value
        double total = price * (1 + tax + tip);
        System.out.println("$" + total);
    }
}
