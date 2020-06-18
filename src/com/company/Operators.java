package com.company;

//Ryan Xie
//6-17
//Challenge Operators Assignment

//Import scanner
import java.util.*;

public class Operators {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // meal price
            double mealCost = scan.nextDouble();
            // tip percent
            int tipPercent = scan.nextInt();
            // tax percent
            int taxPercent = scan.nextInt();
            scan.close();
            //Calculates the percentages
            double tip = mealCost * tipPercent / 100;
            double tax = mealCost * taxPercent / 100;
            //Makes calculation and rounds to nearest dollar
            int totalCost = (int) Math.round(mealCost + tip + tax);
            // Print the total cost
            System.out.println(totalCost);
    }
}

