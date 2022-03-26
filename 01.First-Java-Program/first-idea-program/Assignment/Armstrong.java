package com.Pramit;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = s.nextInt();

        for (int i = num1; i <num2; i++) {
            int check, rem , sum = 0;
            check = i;
            while(check != 0){
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check /= 10;
            }
            if(sum == i){
                System.out.println(i +" is an Armstrong number");
            }
        }
    }
}
