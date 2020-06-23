package com.company;
//Ryan Xie
/*String Challenge assignment for 6/21*/
/*create scanner
declare variables
ask for amount of times the program must run
find run times entered by user
ask for word
create a string
find even or odd indexes using %
print results*/

import java.util.*;

public class StringChallenge {
    public static void main(String[] args)
    {
       
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        for (int i = 0; i < N; i++)
        {
            String string = in.nextLine();
            char[] charArray = string.toCharArray();
            for (int j = 0; j < charArray.length; j++)
            {
                if (j % 2 == 0)
                {
                    System.out.print(charArray[j]);
                }
            }
            System.out.print(" ");
            for (int j = 0; j < charArray.length; j++)
            {
                if (j % 2 != 0)
                {
                    System.out.print(charArray[j]);
                }
            }
            
            System.out.println();
        }
        //end (do I need this?)
        in.close();
    }
}
