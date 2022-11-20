package com.bridgelabz;

import java.util.Scanner;

public class DisplayNumUnit {

    static void checkUnit() {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n >=  1 && n<1001) {
            if (n == 1)
                System.out.println("ONE");
            if (n == 10)
                System.out.println("TEN");
            if (n == 100)
                System.out.println("HUNDREAD");
            if (n == 1000)
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
