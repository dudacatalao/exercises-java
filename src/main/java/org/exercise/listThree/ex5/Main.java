package org.exercise.listThree.ex5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueInsertion = true;
        int positive = 0;
        int negative = 0;
        System.out.println("----------------------------------------------");
        System.out.println("       Calculing the risk to the bank");
        System.out.println("----------------------------------------------");

        do {
            try{
                System.out.print("Insert the balance: R$");
                float balance = sc.nextFloat();

                if (balance > 0){
                    positive++;
                }else {
                    negative++;
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid data.");
                System.out.println("----------------------------------------------");
            }

            System.out.println("Do you want to insert more balance? (yes/no)");
            String option = sc.next().toLowerCase();

            if (option.equals("no")) {
                continueInsertion = false;
            }

        } while (continueInsertion);

        int total = positive + negative;
        double porcentPositive = ((double) positive / total) * 100;
        double porcentNegative = ((double) negative / total) * 100;

        if (porcentPositive > porcentNegative){
            System.out.println("No risk!");
        }else{
            System.out.println("Risk to the bank.");
        }


    }
}
