package org.exercise.listTwo.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n" +
                "█▀▀ ▄▀█ █░░ █▀▀ █░█ █░░ ▄▀█ ▀█▀ █ █▄░█ █▀▀   █▀ ▀█▀ █▀█ █▀▀ █▄▀\n" +
                "█▄▄ █▀█ █▄▄ █▄▄ █▄█ █▄▄ █▀█ ░█░ █ █░▀█ █▄█   ▄█ ░█░ █▄█ █▄▄ █░█");

        System.out.print("Insert the current quantity of stock: ");
        double currentQtd = sc.nextInt();

        System.out.print("Insert the minimum quantity of stock: ");
        double minimumQtd = sc.nextInt();

        System.out.print("Insert maximum quantity of stock: ");
        double maximumQtd = sc.nextInt();


        int averageQuantity = (int) Math.round((maximumQtd + minimumQtd) / 2.0);

        if(currentQtd >= averageQuantity) {
            System.out.println("Do not purchase.");
        } else {
            System.out.println("Make purchase.");
        }
    }
}
