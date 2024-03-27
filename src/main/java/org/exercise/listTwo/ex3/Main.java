package org.exercise.listTwo.ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String color1 = "\u001B[35m";
        String reset = "\u001B[0m";

        System.out.println("\n" + color1 +
                "█░█░█ █░█ █▀█ ▀ █▀   █░█░█ █ █▄░█ ▀█\n" +
                "▀▄▀▄▀ █▀█ █▄█ ░ ▄█   ▀▄▀▄▀ █ █░▀█ ░▄" + reset);

        try {
            System.out.println("------------------------------------------");
            System.out.print("Insert the name of the first Team: ");
            String teamA = sc.nextLine();

            System.out.print("Insert the name of the second Team: ");
            String teamB = sc.nextLine();

            System.out.print("How many goals " + teamA + " did? ");
            int golsA = sc.nextInt();

            System.out.print("How many goals " + teamB + " did? ");
            int golsB = sc.nextInt();

            if (golsA > golsB){
                System.out.println(teamA + " won the game! Congrats.");
            } else if (golsB > golsA) {
                System.out.println(teamB + " won the game! Congrats.");
            }else {
                System.out.println("The teams tied");
            }

        }catch (InputMismatchException e){
            System.out.println("Invalid data.");
        }

    }
}
