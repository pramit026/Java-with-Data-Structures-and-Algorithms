package com.Pramit;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int principal = input.nextInt();
        int time = input.nextInt();
        int rate = input.nextInt();
        int simpleInterest = (principal*time*rate)/100;
        System.out.println(simpleInterest);
    }
}
