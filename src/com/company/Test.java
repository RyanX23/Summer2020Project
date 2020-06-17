package com.company;

public class Test {
    public static void main(String [] args){
        double numb1 = 100.0;
        double numb2 = 5.5;
        double numb3 = 3.4;
        double numb4 = Math.getExponent(numb2);
        double numb5 = Math.abs(numb1);
        double numb6 = Math.sqrt(numb3);
        System.out.printf("%8.3f \n %10.3f \n %10.3f", numb4, numb5, numb6);
    }
}
