package com.company;
import java.util.*;

public class DataType {

    public static void main(String[] args) {
        //Declare Value of Integers
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

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