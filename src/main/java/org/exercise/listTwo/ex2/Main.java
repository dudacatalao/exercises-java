package org.exercise.listTwo.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the unitary value of the product: R$");
        float unitaryValue = sc.nextFloat();

        System.out.print("Insert the quantity of the product: ");
        int quantity = sc.nextInt();

        double priceProduct = 0;

        if(quantity <= 12){
            priceProduct = unitaryValue  * quantity;
        } else if (quantity >= 12) {
            double discount = unitaryValue * 0.10;
            priceProduct = (unitaryValue - discount) * quantity;
        }
    }
}
