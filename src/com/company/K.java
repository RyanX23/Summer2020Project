package com.company;
/*Ryan Xie
K Shape Program*/

public class K {
    public static final int SIZE = 7;
    
    //Tells system what to print out (variables Top and bottom)
    public static void main(String args[]) {
        Top();
        Bottom();
    }
    //Have to tell system what the two variables do - what shapes for it to print out. This is divided into two parts, the Top and Bottom

    //Declares Top variable
    public static void Top() {
        char letter = 65;
        //for loop that sets up the top part of the K shape by making letter spots decrease while maintaining the ABC... order
        for (byte line = SIZE; line >= 0; line--) {
            for (byte count = 0; count < line; count++) {
                System.out.print((char) (letter + count) + " ");
            }
            //tells system to print and return a line
            System.out.println();
        }

    }
    //repeat the same process but for the bottom half. Sets up the lower K shape
    public static void Bottom() {
        int alphabet = 65;
        //for loop that creates an acending slant for the lower K shape while having the ABCs go in order for each line
        for (int i = 0; i <= SIZE-1; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            //Prints lower half and new line
            System.out.println();
        }
    }

}
