package com.company;
//Ryan Xie
public class Challenge2 {
    public static final int SIZE=1;
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
        for (int dash=0; dash< 9*SIZE; dash++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void Top() {
        for (int line = 1; line < 5*SIZE; line++) {
            System.out.print("|");
            for (int space = 1; space <= -1 * line + 5*SIZE; space++) {
                System.out.print(" ");
            }

            for (int dot = 1; dot <= line - SIZE; dot++) {
                System.out.print("/");
            }
            System.out.print("*");

            for (int dot = 1; dot <= line - SIZE; dot++) {
                System.out.print("\\");
            }
            for (int space = 1; space <= -1 * line + 5*SIZE; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Bottom() {
        for (int line = 1; line < 5*SIZE - SIZE +1; line++) {
            System.out.print("|");
            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }
            for (int dot = 1; dot <= -1* line + 4*SIZE; dot++) {
                System.out.print("\\");
            }
            System.out.print("*");

            for (int dot = 1; dot <= -1* line + 4*SIZE; dot++) {
                System.out.print("/");
            }
            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
