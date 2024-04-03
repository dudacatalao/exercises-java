package org.exercise.listOne.ex6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("--------------------------------------\n           Weighted Average\n--------------------------------------");

            System.out.print("Insert your first Grade: ");
            float firstGrade = sc.nextFloat();

            System.out.print("Insert your second Grade: ");
            float secondGrade = sc.nextFloat();

            Average average = new Average(firstGrade, secondGrade);

            double value = average.weightedAverage();
            String green = "\u001B[32m";
            String red = "\u001B[31m";

            if (value > 5){
                System.out.printf(green + "Weighted Average of your grades: %.2f%n", value);
            } else {
                System.out.printf(red + "Weighted Average of your grades: %.2f%n", value);
            }


        }catch (InputMismatchException e){
            System.out.println("Invalid data.");
        }

    }
}
