package org.exercise.listThree.ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color = "\u001B[35m";
        String reset = "\u001B[0m";

        System.out.println(color + "------------------------------------");
        System.out.println("|       Tallest and Heaviset       |");
        System.out.println("------------------------------------" + reset);

        String heaviestName = "";
        float heaviestWeight = Float.MIN_VALUE;
        String tallestName = "";
        float tallestHeight = Float.MIN_VALUE;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Insert the name of the " + i + "° person:");
            String name = sc.next();

            System.out.print("Insert the weight of the " + i + "° person:");
            float weight = sc.nextFloat();

            System.out.print("Insert the height of the " + i + "° person:");
            float height = sc.nextFloat();

            if (weight > heaviestWeight) {
                heaviestName = name;
                heaviestWeight = weight;
            }

            if (height > tallestHeight) {
                tallestName = name;
                tallestHeight = height;
            }

            System.out.println("--------------------------------------------------");
        }

        System.out.println("The heaviest person is " + heaviestName + " with weight: " + heaviestWeight);
        System.out.println("The tallest person is " + tallestName + " with height: " + tallestHeight);
    }
}
