package org.exercise.listOne.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------------------");
        System.out.println("    Welcome to our systems to calculate the sale value");
        System.out.println("------------------------------------------------------------");

        System.out.print("Insert the price of the purchase: R$");
        double price = sc.nextFloat();

        double priceSale = price + (price * 0.20);
        double priceTax = price + (price * 0.30);
        double priceTotal = price + (price * 0.20) + (price * 0.30);

        System.out.println("Calculating prices..");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("-------------------------------");
        System.out.printf("Initial Price: R$%.2f\n", price);
        System.out.printf("Sale Price: R$%.2f\n", priceSale);
        System.out.printf("Price with Tax: R$%.2f\n", priceTax);
        System.out.printf("Price Total: R$%.2f\n", priceTotal);
    }
}
