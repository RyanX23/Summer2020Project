package com.company;

public class PrintEvenOddNumbers {
    public static void main(String args[]) {
        int n = 100;
        System.out.print("Even Numbers from 1 to "+n+" are: ");
        for (int i = 1; i <= n; i++) {
            //if number%2 == 0 it means its an even number
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        int x = 100;
        System.out.println("");
        System.out.print("Odd Numbers from 1 to "+x+" are: ");
        for (int i = 1; i <= n; i++) {
            //if number%2 == 1 it means its an odd number
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}