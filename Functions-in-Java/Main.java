package com.Pramit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Q: take input of 2 numbers and print the sum
        Scanner s = new Scanner(System.in);
        int num1, num2 , sum;
        System.out.print("Enter first no: ");
        num1 = s.nextInt();

        System.out.print("Enter Second no: ");
        num2 = s.nextInt();

        sum = num1 + num2;
        System.out.println("The sum is : "+ sum);
    }
}
