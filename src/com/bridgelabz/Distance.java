package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    /**
    *This Method Created For Calculate the Distance of Two Points
    */
    public static void main(String[] args) {
    /**
    *x1 variable for first point and y1 variable for second point
    */
        double x1;
        double y1;
        System.out.println("Enter the coordinates:x1,y1");
        Scanner scanner  =new Scanner(System.in);
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
    /**
    *Using Formula for calculating the Distance Of Two Points
    */
        double distance = Math.sqrt((Math.pow(x1, 2) + (Math.pow(y1, 2))));
     /**
    *Print The  Distance of Two Points
    */
        System.out.println("Eucledian distance between entered coordinates is = "+distance);
    }
}
