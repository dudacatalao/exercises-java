package org.exercise.listThree.ex1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" +
                "███╗░░██╗██╗░░░██╗███╗░░░███╗██████╗░███████╗██████╗░░██████╗\n" +
                "████╗░██║██║░░░██║████╗░████║██╔══██╗██╔════╝██╔══██╗██╔════╝\n" +
                "██╔██╗██║██║░░░██║██╔████╔██║██████╦╝█████╗░░██████╔╝╚█████╗░\n" +
                "██║╚████║██║░░░██║██║╚██╔╝██║██╔══██╗██╔══╝░░██╔══██╗░╚═══██╗\n" +
                "██║░╚███║╚██████╔╝██║░╚═╝░██║██████╦╝███████╗██║░░██║██████╔╝\n" +
                "╚═╝░░╚══╝░╚═════╝░╚═╝░░░░░╚═╝╚═════╝░╚══════╝╚═╝░░╚═╝╚═════╝░");

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> positiveNumbers = new ArrayList<>();

        try {
            for (int i = 0; i < 10; i++) {
                System.out.print("Insert a number: ");
                int number = sc.nextInt();

                if(number % 2 == 0){
                    evenNumbers.add(number);
                } else{
                    oddNumbers.add(number);
                }

                if(number > 0){
                    positiveNumbers.add(number);
                }else{
                    negativeNumbers.add(number);
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid data, insert a Integer number.");
        }

        System.out.println("-----------------------------------------------------------");
        System.out.print("[A] Even numbers\n[B] Odd numbers\n[C] Negative numbers\n[D] Positive numbers\n[E] Exit\nWhich option do you want to see?\n-> ");
        String option = sc.next().toUpperCase();

        try {
            System.out.println("Loading..");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        switch (option){
            case "A":
                System.out.println("Even Numbers:");
                for (int i = 0; i < evenNumbers.size(); i++) {
                    System.out.print(evenNumbers.get(i));
                    if (i < evenNumbers.size() - 1) {
                        System.out.print(", ");
                    }
                }
                break;
            case "B":
                System.out.println("Odd Numbers:");
                for (int i = 0; i < oddNumbers.size(); i++) {
                    System.out.print(oddNumbers.get(i));
                    if (i < oddNumbers.size() - 1) {
                        System.out.print(", ");
                    }
                }
                break;
            case "C":
                System.out.println("Negative numbers:");
                for (int i = 0; i < negativeNumbers.size(); i++) {
                    System.out.print(negativeNumbers.get(i));
                    if (i < negativeNumbers.size() - 1) {
                        System.out.print(", ");
                    }
                }
                break;
            case "D":
                System.out.println("Positive numbers:");
                for (int i = 0; i < positiveNumbers.size(); i++) {
                    System.out.print(positiveNumbers.get(i));
                    if (i < positiveNumbers.size() - 1) {
                        System.out.print(", ");
                    }
                }
                break;
            case "E":
                System.out.println("Finishing...");
                System.exit(0);

            default:
                System.out.println("Invalid option.");
        }
    }
}
