package com.Pramit;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20,30);
        System.out.println(ans);
    }
    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }



    // return the value
    static int sum2(){
        Scanner s = new Scanner(System.in);
        int num1, num2 , sum;
        System.out.print("Enter first no: ");
        num1 = s.nextInt();

        System.out.print("Enter Second no: ");
        num2 = s.nextInt();

        sum = num1 + num2;
        return sum;
    }


    static void sum(){
        Scanner s = new Scanner(System.in);
        int num1, num2 , sum;
        System.out.print("Enter first no: ");
        num1 = s.nextInt();

        System.out.print("Enter Second no: ");
        num2 = s.nextInt();

        sum = num1 + num2;
        System.out.println("The sum is : "+ sum);
    }




    /*

        access modifier   return_type name(arguments){

            // body
            return statement;
        }

     */
}
