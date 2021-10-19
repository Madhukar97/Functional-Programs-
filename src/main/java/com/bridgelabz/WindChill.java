package com.bridgelabz;

import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {

        int[] arr=UserInput();
        int t = arr[0];
        int v = arr[1];

        while(t>50 || v>120 || v<3){

            arr=UserInput();
            t = arr[0];
            v = arr[1];
        }
        double w = 35.74 + 0.6215*t + (0.4275*t+35.75)*Math.pow(v,0.16);
        System.out.println("The WindChill is : " + w);
    }
    public static int[] UserInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in F and wind speed in mph : ");
        int t = scanner.nextInt();
        int v = scanner.nextInt();
        int[] arr = new int[2];
        arr[0]=t;
        arr[1]=v;
        return arr;
    }

}
