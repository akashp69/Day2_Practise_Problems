package com.bridgelabz;

import java.util.Scanner;

public class DisplayNumUnit {

    static void checkUnit() {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
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

    public static void main(String[] args) {
        System.out.println("Enter Number 1,10,100,1000 For Checking Unit");
        checkUnit();

    }
}
