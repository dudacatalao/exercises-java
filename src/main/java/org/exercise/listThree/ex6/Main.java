package org.exercise.listThree.ex6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color = "\u001B[35m";
        String reset = "\u001B[0m";

        System.out.println(color + "------------------------------------");
        System.out.println("|       Multiplication Table       |");
        System.out.println("------------------------------------" + reset);


        System.out.print("Insert a integer number: ");
        int number = sc.nextInt();

        try {
            System.out.println("Calculing...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i = 1; i < 11; i++){
            int count = number * i;
            System.out.println(number + " x " + i + " = " + count);
        }
    }
}
