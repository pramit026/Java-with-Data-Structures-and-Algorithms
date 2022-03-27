package com.Pramit;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Take input from user till user does not press x
        int ans = 0;
        while(true) {
            // take operator as input
            System.out.print("Enter the Operator: ");
            char op = s.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two no
                System.out.print("Enter Two Numbers: ");
                int num1 = s.nextInt();
                int num2 = s.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }
}
