package com.Pramit;

import java.util.Scanner;

public class Inr2Usd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float inr = s.nextFloat();
        float usd = 0.013109f * inr;
        System.out.println("inr "+inr+" in usd is "+usd);
    }
}
