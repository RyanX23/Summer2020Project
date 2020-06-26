package com.company;

//Ryan Xie and Josh Titens Final Project

//Link to our presentation: https://docs.google.com/presentation/d/1fjg22G8Ym1bDjzz8OkN3IZje31Y4G679amKEHGZaXHY/edit?usp=sharing

//Import Scanner and File
//create file
//file needs to be 20 lines of 20 int, doubles, and words for each line (400) token total
//if they say yes ask them whether they want to play the word guessing game or the number guessing game
//if they say yes ask them whether they want to play the word guessing game or the number guessing game
// If they want to play the word version activate the method that allows them guess words from the file
//make method scan through the file to see if the word the user guessed is in the file
//If the answer the user gives is number and not word, repeat the same process but activate the numbers game (via else statement)
//Regardless of number or word game, add score to scoreboard whenever user gets correct answer (if they get one correct they get 1/1 if they get one wrong they are 0/1 and keep track and add all of these idiviudal scores
////per question and add them to make a final score at the end)
//If they want to play the game again let them play again
//when the user is finished playing calculate their score out of the times they guessed
//Create two methods one for finding words in the file and one for finding numbers in file

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;



public class Project {
    public static void main(String[] args) throws FileNotFoundException //make sure to have throws
    {

        //create a 3 objects- the file(not needed in main), a scanner for user input, a scanner for the welcome file reading, and a scanner for the file(used later, not needed in main)
        Scanner input = new Scanner(System.in);
        //declare variables to be used inside the do while (can't be declared inside)
        String playAgain;
        String wordsInts;
        String word;
        int games = 0;
        int wins = 0;
        //do while to play again
        do {
            File file = new File("C:\\Users\\Ryan Xie\\IdeaProjects\\Summer2020\\src\\com\\company\\AA");

            Scanner filesc = new Scanner(file);
            //words or numbers decision
            System.out.println("Would you like to play with words or numbers?");
            wordsInts = input.next();

            //for words, have the person guess food and send that word to

            if (wordsInts.contains("word")) {
                System.out.println("Guess a word!");
                word = input.next();
                wins = wordSearch(word, wins, filesc);
            } else {
                System.out.println("Guess a number!");
                wordsInts = input.next();
                wins = numberSearch(wordsInts, wins, filesc);
            }
            games++;
            //  System.out.println("Score: "+ wins+"/"+games);
            System.out.println("Would you like to play again?");
            playAgain = input.next();
            filesc.close();
        } while (playAgain.contains("y"));
        if (playAgain.contains("n")) {
            System.out.println("Final Score: " + wins + "/" + games);
        }
    }

    public static int wordSearch(String word, int wins, Scanner filesc) {
        //create stuff for scanning the file

        String trash = "";
        while (filesc.hasNext()) {
            if (word.equals(filesc.next())) {
                System.out.println("Congrats! You found a word!");
                wins++;

            }
        }
        return wins;
    }

    public static int numberSearch(String word, int wins, Scanner filesc) {
        //create stuff for scanning the file
        String trash = "";
        while (filesc.hasNext()) {
            if (word.equals(filesc.next())) {
                System.out.println("Congrats! You found a number!");
                wins++;
                break;

            }
        }

        return wins;
    }


}