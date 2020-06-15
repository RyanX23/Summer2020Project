package com.company;
//Ryan Xie
public class Challenge2 {
    public static final int SIZE=4;
    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();
    }
    public static void Line(){

        System.out.print("+");
        for (int dash=0; dash< 2*SIZE+1; dash++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void Top() {
        for (int line = 1; line < SIZE+1; line++) {
            System.out.print("|");
            for (int space = 1; space <= -1 * line + SIZE + 1; space++) {
                System.out.print(" ");
            }

            for (int dot = 1; dot <= line - 1; dot++) {
                System.out.print("/");
            }
            System.out.print("*");

            for (int dot = 1; dot <= line - 1; dot++) {
                System.out.print("\\");
            }
            for (int space = 1; space <= -1 * line + SIZE + 1; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Bottom() {
        for (int line = 1; line < SIZE + 1; line++) {
            System.out.print("|");
            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }
            for (int dot = 1; dot <= -1* line + SIZE; dot++) {
                System.out.print("\\");
            }
            System.out.print("*");

            for (int dot = 1; dot <= -1* line + SIZE; dot++) {
                System.out.print("/");
            }
            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
