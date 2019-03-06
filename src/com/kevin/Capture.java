package com.kevin;

import java.util.Scanner;

public class Capture {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//for inputs from the computer..
        while (true){
            System.out.println("Enter First Number: ");
            int x = s.nextInt();
            if (x == 555)
                break;

            System.out.println("Enter Second Number: ");
            double y = s.nextDouble();

            double result = x * y;
            System.out.println("Result is " + result);
        }
    }
}
