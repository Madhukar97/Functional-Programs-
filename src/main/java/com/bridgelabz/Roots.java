package com.bridgelabz;

import java.util.Scanner;

public class Roots {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficients a,b,c of the quadratic equation : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double delta = b*b - 4*a*c;
        double root1 = (-b + Math.sqrt(delta))/(2*a);
        double root2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("The roots are: " +root1+ " and "+ root2);


    }
}
