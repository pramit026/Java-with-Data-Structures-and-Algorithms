package com.Pramit;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int first = 0;
        int next = 1;
        int count = 2;
        while(count <= n){
            int temp = next;
            next = first + next;
            first = temp;
            count ++;
        }
        System.out.println(next);
    }
}
