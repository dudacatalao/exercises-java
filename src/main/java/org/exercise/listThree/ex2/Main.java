package org.exercise.listThree.ex2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<Float> heights = new ArrayList<>();
        ArrayList<Float> weights = new ArrayList<>();

        try{
            for(int i = 1; i < 11; i++){
                System.out.println("--------------------------------------------------");
                System.out.print("Insert the age of the " + i + "° person: ");
                int age = sc.nextInt();

                System.out.print("Insert the height of the " + i +"° person(m): ");
                float height = sc.nextFloat();

                System.out.print("Insert your weight of the "+ i + "° person(kg): ");
                float weight = sc.nextFloat();

                if (age > 50){
                    ages.add(age);
                } else if (height > 1.60) {
                    heights.add(height);
                } else if (weight < 80.00 ) {
                    weights.add(weight);
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid data.");
        }

        System.out.println("--------------------------------------------------");
        System.out.println("People aged over 50 years:");
        for (int i = 0; i < ages.size(); i++) {
            System.out.println(ages.get(i));
            if (i < ages.size() - 1) {
                System.out.println(", ");
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("People taller than 1.60m:");
        for (int i = 0; i < heights.size(); i++) {
            System.out.println(heights.get(i));
            if (i < heights.size() - 1) {
                System.out.println(", ");
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("People weighing less than 80kg:");
        for (int i = 0; i < weights.size(); i++) {
            System.out.println(weights.get(i));
            if (i < weights.size() - 1) {
                System.out.println(", ");
            }
        }

    }
}