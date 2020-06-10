package com.company;

public class K {
    public static final int SIZE = 7;

    public static void main(String args[]) {
        Top();
        Bottom();
    }

    public static void Top() {
        char letter = 65;
        for (byte line = SIZE; line >= 0; line--) {
            for (byte count = 0; count < line; count++) {
                System.out.print((char) (letter + count) + " ");
            }
            System.out.println();
        }

    }
    public static void Bottom() {
        int alphabet = 65;
        for (int i = 0; i <= SIZE-1; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }

}
