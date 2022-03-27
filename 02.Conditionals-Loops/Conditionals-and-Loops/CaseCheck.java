package com.Pramit;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().trim().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        }else{
            System.out.println("Lowercase");
        }

    }
}
