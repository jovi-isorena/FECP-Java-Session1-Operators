package org.example;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* Write a program that takes in a float Celsius, and displays
        its equivalent value in Fahrenheit in two decimal places. The
        formula is as follows: °F = °C × (9/5) + 32.
         */

        Scanner sc = new Scanner(System.in);
        float input, output;
        try {
            System.out.print("Enter temperature in Celsius: ");
            input = sc.nextFloat();
            output = input * 9/5 + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f%n", output);

        }catch (NumberFormatException e){

        }

    }
}