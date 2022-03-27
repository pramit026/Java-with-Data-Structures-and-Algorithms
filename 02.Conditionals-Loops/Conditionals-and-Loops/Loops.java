package com.Pramit;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);

        // Q: print no from 1 to 5

        /*
        for loop syntax:

        for(initialization; condition ; increment / decrement){
            // body
        }
         */

//        for(int number = 1; number <= 5; number++){
//            System.out.println(number);
//        }

//        // print numbers from 1 to n
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        for (int num = 1; num <=n ; num++) {
//            System.out.print(num + " ");
//        }

            // while loop
       /*
       Syntax:
       while(condition){
            // body
        }
        */
//        int num = 1;
//        while(num <= 5){
//            System.out.println(num);
//            num ++ ;
//        }
//// use for loop when you know for how many times you need to run a loop , if you dont know then use while loop


        // do while loop
        /*
        do{

        }while(condition)
         */
        // it will execute atleast once... first it will print then it will check the condition
        int n = 1;
        do{
            System.out.println(n);
            n ++;
        }while(n <= 5);

    }
}
