package com.company;

import java.io.BufferedReader;
import java.io.File;

import java.util.Scanner;

public class ProjectNumber {
    public static void main(String[] args) throws Exception {

            File file =
                    new File("C:\\Users\\Ryan Xie\\Downloads\\Number.txt");
            Scanner sc = new Scanner(file);

        while(sc.hasNextLine()) {
            String[] numstrs = sc.nextLine().split("\\s+");
            int[] nums = new int[numstrs.length];
            for(int i = 0; i < nums.length; i++) nums[i] = Integer.parseInt(numstrs[i]);

        }
        int right_guess = sc.nextInt();
        int score = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of times (turns) you want to play:");
        int times = input.nextInt();


        int turns = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number between 1 to 100, You will have " + times + " turns.");

        int guess;
        int i = 0;
        boolean win = false;
        while (win == false) {
            guess = scan.nextInt();
            turns++;

            if (guess == right_guess) {
                win = true;
                score += 100;
            } else if (i > times - 2) {
                System.out.println("You loose.");
                System.out.println("The number was " + right_guess);
                System.out.println("You used " + turns + " turns");
                System.out.println("Your score is " + score + "!");
                return;
            } else if (guess < right_guess) {
                i++;
                System.out.println("Yor Guess is lower than the right guess! Turns left: " + (times - i));


            } else if (guess > right_guess) {
                i++;
                System.out.println("Your Guess Is higher than the right guess! Turns left: " + (times - i));

            }


        }
        System.out.println("You win.");
        System.out.println("The number was " + right_guess);
        System.out.println("You used " + turns + " turns to guess the right number");
        System.out.println("Your score is " + score + "!");

    }

}

