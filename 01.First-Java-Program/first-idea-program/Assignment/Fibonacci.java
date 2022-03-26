package com.Pramit;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3 ;

        // printing firs two terms
        System.out.println(num1 +"\n"+ num2);

        // from 2 to n
        for (int i = 2; i <= n ; i++) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
