package com.bridgelabz;

import java.util.Scanner;

public class EuclideanDistance {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the co-ordinates x,y: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double distance = Math.sqrt(x*x+y*y);
        System.out.println("The Euclidean Distance of the point from origin is = "+ distance);


    }
}
