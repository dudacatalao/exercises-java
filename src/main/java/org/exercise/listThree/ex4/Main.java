package org.exercise.listThree.ex4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String color = "\u001B[35m";
        String reset = "\u001B[0m";

        System.out.println(color + "-------------------------------\n|     Incrementing number      |\n-------------------------------" + reset);

        try {
            System.out.print("Insert a Number: ");
            int number = scanner.nextInt();

            System.out.print("Insert a increment: ");
            int increment = scanner.nextInt();

            System.out.println("-------------------------------");
            System.out.println("Result:");
            for (int i = 0; i <= number; i += increment) {
                System.out.print(color + i + " ");
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid data.");;
        }



    }
}
