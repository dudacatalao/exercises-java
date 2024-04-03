package org.exercise.listTwo.ex6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n" +
                "█░░ █░█ █▀▀ █▄▀ █▄█   █▄░█ █░█ █▀▄▀█ █▄▄ █▀▀ █▀█\n" +
                "█▄▄ █▄█ █▄▄ █░█ ░█░   █░▀█ █▄█ █░▀░█ █▄█ ██▄ █▀▄");

        System.out.println("We draw a lucky number between 0 and 100 for you, try to get it right");
        System.out.println("You have three chances to guess\nLet's start!");

        int seconds = 3;

        for (int i = seconds; i >= 1; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            double doubleRandomNumber = Math.random() * 100;
            int randomNumber = (int)doubleRandomNumber;
            int chances = 3;
            while (chances > 0){
                System.out.println("-----------------------------");
                System.out.print("Insert your guess: ");
                int numberUser = sc.nextInt();

                if(numberUser == randomNumber){
                    System.out.println("You're right.");
                }else{
                    System.out.println("You missed.");
                }
                chances -= 1;
            }

        }catch (InputMismatchException e){
            System.out.println("Invalid data.");
        }


    }
}
