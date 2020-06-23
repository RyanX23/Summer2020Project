package com.company;

import java.util.Arrays;
import java.util.Random;

public class ArrayClasswork {
    public static void main(String[] args){
        Random randy = new Random();
        int size = randy.nextInt(5)+5;
        int [] numbers = new int[size];
        for (int i=0; i<size; i++){
            numbers[1] = randy.nextInt(100);
        }
        int l;
        int c;
        do{
            l = randy.nextInt(size);
            c = randy.nextInt(size);
        } while (l==c);
        System.out.println(Arrays.toString(numbers));
        numbers = reverse(numbers,l,c);
        System.out.println(Arrays.toString(numbers));
    }
    public static int [] reverse (int [] num, int a, int b){
        int temp = num [a];
        num [a] = num [b];
        num [b] = temp;
        return num;
    }
}
