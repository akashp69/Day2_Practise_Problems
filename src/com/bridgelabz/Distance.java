package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        double x1;
        double y1;
        System.out.println("Enter the coordinates:x1,y1");
        Scanner scanner  =new Scanner(System.in);
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        double distance = Math.sqrt((Math.pow(x1, 2) + (Math.pow(y1, 2))));
        System.out.println("Eucledian distance between entered coordinates is = "+distance);
    }
}