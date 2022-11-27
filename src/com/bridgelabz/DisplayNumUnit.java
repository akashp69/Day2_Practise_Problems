package com.bridgelabz;

import java.util.Scanner;

public class DisplayNumUnit {
    /**
    *This Method Created For Checking The Unit Of Numbers 1,10,100,1000
    */

    static void checkUnit() {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
    /**
    *Using If-else-if loop  For Printing The Unit Of Given Number
    */
        if (number >=  1 && number<1001) {
            if (number == 1)
                System.out.println("ONE");
            if (number == 10)
                System.out.println("TEN");
            if (number == 100)
                System.out.println("HUNDREAD");
            if (number == 1000)
                System.out.println("THOUSAND");

        }
        else
            System.out.println("Enter Wrong Digit For Checking Unit ");


    }
    /**
    *This Method Created For call the checkUnit Method 
    */

    public static void main(String[] args) {
        System.out.println("Enter Number 1,10,100,1000 For Checking Unit");
        checkUnit();

    }
}
