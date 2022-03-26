package com.Pramit;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        if(num1 > num2){
            System.out.println("Largest: "+num1);
        }else {
            System.out.println("Largest: " + num2);
        }
    }
}
