package com.Pramit;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temp in celcius: ");
        float celcius = in.nextFloat();
        float fah = (celcius *9 /5) + 32;
        System.out.println("Temp in fahrenheit is: "+fah);

    }
}
