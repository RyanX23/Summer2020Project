package com.company;
/*Ryan Xie
Gangsta Name Assignment*/

//import scanner
import java.util.*;

public class GangstaName {
    public static void main(String[] args) {
        //start up scanner
        Scanner console = new Scanner(System.in);
        //prompts user to input name
        System.out.print("Type your name, playa: ");
        String name = console.nextLine();
        //creates variable 'first' that grabs yout first name
        String first = name.substring(0, name.indexOf(" "));
        //creates last name that prints everyhting in CAPS
        String last = name.substring(name.indexOf(" ") + 1);
        last = last.toUpperCase();
        //Creates first initial
        String fInitial = first.substring(0, 1);
        
        //puts everything above together into the correct order and adds 'gangsta' words into the line to complete your gangsta name
        System.out.println("Your gangsta name is \"" + fInitial +
                ". Diddy " + last + " " + first + "-izzle\"");
    }
}
