package com.company;

public class ModifyProgram {

    public static void main(String[] args) {
        int subtotal;
        subtotal = 108;

        // Calculate total owed, assuming 8% tax / 15% tip

        System.out.println("Subtotal:");

        System.out.println(subtotal);

        System.out.println("Tax:");

        System.out.println((subtotal) * .08);

        System.out.println("Tip:");

        System.out.println((subtotal) * .15);

        System.out.println("Total:");

        System.out.println(subtotal +

                (subtotal) * .15 +

                (subtotal) * .08);

    }

}