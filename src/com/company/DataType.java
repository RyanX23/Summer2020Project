package com.company;

//Ryan Xie
// 06/16/2020
//Challenge DataType

//Declare Value of Integers
// Declare second integer, double, and string variables
// Reading, saving the integer, double, and String to the variables above
// Print the sum of the integer variables
// Print the sum of the two variables
//Print out both strings


import java.util.*;

public class DataType {

    public static void main(String[] args) {
        //Declare Value of Integers
        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";

        Scanner scan = new Scanner(System.in);
        // Declare second integer, double, and string variables
        int i2;
        double d2;
        String s2;

        // Reading, saving the integer, double, and String to the variables above
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine();
        s2 = scan.nextLine();

        // Print the sum of the integer variables
        System.out.println(i + i2);

        // Print the sum of the two variables
        System.out.println(d + d2);

        // Print both strings
        System.out.println(s + s2);

        scan.close();
    }
}
