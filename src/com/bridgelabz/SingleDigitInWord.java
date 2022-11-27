package com.bridgelabz;

import java.util.Scanner;

public class SingleDigitInWord {
    /**
    *This Method Created For Print The Single Number In Word 
    */

    static void checkWord(){
        int n;
        Scanner scanner = new Scanner(System.in);
        n =scanner.nextInt();
    /**
    *Using if-else-if for write single digit number in word 
    */

        if(n<10){
            if(n==1)
                System.out.println("ONE");
            if(n==2)
                System.out.println("TWO");
            if(n==3)
                System.out.println("THREE");
            if(n==4)
                System.out.println("FOUR");
            if(n==5)
                System.out.println("FIVE");
            if(n==6)
                System.out.println("SIX");
            if(n==7)
                System.out.println("SEVEN");
            if(n==8)
                System.out.println("EIGHT");
            if(n==9)
                System.out.println("NINE");

        }
        else
            System.out.println("Given Number is Greater Than Single Digit");
    }


    public static void main(String[] args) {
        System.out.println("Enter a Single Digit ");
        checkWord();
    }
}
