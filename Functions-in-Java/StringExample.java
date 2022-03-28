package com.Pramit;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.next();

        String personalized_message = myGreet(name);
        System.out.println(personalized_message);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }


    static String greet(){
        String greeting = "How are you?";

        return greeting;
    }
}
