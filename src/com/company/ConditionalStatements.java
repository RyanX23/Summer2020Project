package com.company;

/* RYAN XIE
6/19/2020

Import scanner
Setup math equation
Even numbers have no remainder when divided by 2
Odd numbers have a remainder of 1 when divided by two

Setup if statements:
If a number has a remainder, it is odd and therefore "weird"
If it is even and in the inclusive range of 2 to 5, print Not Weird
If it is even and in the inclusive range of 6 to 20, print Weird
If it is even and greater than 20, print Not Weird

End code off by commanding it to print out the answer based off of the above if statements
 */

import java.util.*;

public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==1){
            ans = "Weird";
        }
        else{
            if(n>2 && n<=5){
                ans = "Not Weird";
            }
            if(n>5 && n<=20){
                ans = "Weird";
            }
            else{
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }
}
