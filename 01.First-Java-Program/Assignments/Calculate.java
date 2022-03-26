package com.Pramit;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        char op = s.next().charAt(0);
        if(op == '+'){
            int sum = num1 + num2 ;
            System.out.println(sum);
        }else if(op == '-'){
            int sub = num1 - num2;
            System.out.println(sub);
        }else if(op == '*'){
            System.out.println(num1*num2);
        }else{
            System.out.println(num1/num2);
        }
    }
}
