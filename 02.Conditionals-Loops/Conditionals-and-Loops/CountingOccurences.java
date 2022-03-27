package com.Pramit;

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int target = s.nextInt();
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == target){
                count ++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
