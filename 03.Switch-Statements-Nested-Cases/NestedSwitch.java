package com.Pramit;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int empId = s.nextInt();
        String department = s.next();
        switch (empId) {
            case 1 -> System.out.println("Pramit Sahoo");
            case 2 -> System.out.println("Ankit");
            case 3 -> {
                System.out.println("Employee no 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter Correct Employee id");
        }
    }
}
