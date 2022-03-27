package com.Pramit;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        // find largest of the three number
//        int max = a;
//        if(b > max){
//            max = b;
//        }else if(c > max){
//            max = c;
//        }
//        int max = 0;
//            if(a > b){
//                max = a;
//            }else{
//                max = b;
//            }
//            if(c > max){
//                max = c;
//        }
        int max = Math.max(Math.max(a,b),c);

        System.out.println("max: "+ max);
    }
}
