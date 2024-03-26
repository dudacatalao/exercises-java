package org.exercise.ListOne.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color1 = "\u001B[35m";
        String reset = "\u001B[0m";

        System.out.println(color1 + "Predecessor and Successor" + reset);

        System.out.print("Insert a integer number: ");
        int number = sc.nextInt();

        int predecessor = number - 1;
        int successor = number + 1;

        System.out.println("Number: " + number);
        System.out.println("The Predecessor: " + predecessor);
        System.out.println("The Successor: " + successor);

    }
}
