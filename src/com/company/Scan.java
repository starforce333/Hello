package com.company;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        System.out.println("Enter your text: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        System.out.println();
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("a + b = " + c);
    }
}
