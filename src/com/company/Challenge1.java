package com.company;
/* Ryan Xie 
Challenge 1 Rocket */

public class Challenge1 {

    //very basic code - first 'challenge'. Spaghetti code that makes use of two variables plus some line-by line coding in the middle.
    public static void main(String[] args) {
        //Tell system to print 'Top' and 'TopBox' variables in that order
        Top();
        TopBox();
        TopBox();
        //Line-by-line code makes the middle section of the rocket
        System.out.println("+------+");
        System.out.println("|United|");
        System.out.println("|States|");
        //Uses variable 'TopBox' to save time on not having to code line-by-line
        TopBox();
        //Prints out a line of dashes
        System.out.println("+------+");
        //Finishes off by printing the variable 'Top' to complete the rocket
        Top();
    }
    //We have to declare all the variables used above
    //First is 'Top'. Print out what the system should print when the variable 'Top' is used
    public static void Top(){
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    //Next is 'TopBox'. Print out what the system should print when the variable 'TopBox' is used
    public static void TopBox(){
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
    }
}
