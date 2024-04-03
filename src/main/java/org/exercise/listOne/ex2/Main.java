package org.exercise.listOne.ex2;
import java.lang.Thread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.println("        Welcome to my calculator :)");
        System.out.println("------------------------------------------");

        System.out.print("Insert the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Insert the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Calculing...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------------");
        Calculing calculing = new Calculing(num1,num2);
        System.out.println(calculing.resumeCounts());
    }
}
