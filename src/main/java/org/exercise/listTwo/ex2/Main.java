package org.exercise.listTwo.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n" +
                "█▀ █░█ █▀█ █▀█ █▀█ █ █▄░█ █▀▀\n" +
                "▄█ █▀█ █▄█ █▀▀ █▀▀ █ █░▀█ █▄█");
        System.out.println("             Welcome!");
        System.out.println("------------------------------------");

        try {
            System.out.print("Insert the unitary value of the product: R$");
            float unitaryValue = sc.nextFloat();

            System.out.print("Insert the quantity of the product: ");
            int quantity = sc.nextInt();

            double priceDiscount = unitaryValue - (unitaryValue * 0.10);

            if (quantity > 12){
                System.out.println("Congrats! You got 10% discount, and will pay: " + (priceDiscount * quantity));
            } else{
                System.out.println("You will pay: " + (unitaryValue * quantity));
            }

        }catch (InputMismatchException e){
            System.out.println("Invalid data.");
        }

    }
}
