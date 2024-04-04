package org.exercise.listThree.ex3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------\n          Movie\n-------------------------");
        System.out.println("Hello fan of The Hunger Games!\nGive your opinion for us.");

        System.out.print("Insert the number of fans that going to answer the quiz: ");
        int numberOfPeople = sc.nextInt();

        ArrayList<Integer> great = new ArrayList<>();
        ArrayList<Integer> good = new ArrayList<>();
        ArrayList<Integer> bad = new ArrayList<>();

        try {
            for (int i = 1; i < numberOfPeople + 1; i++) {
                System.out.println("-------------------------");
                System.out.print(i + "° person:\n[1] Great\n[2] Good\n[3] Bad\n->");
                int grade = sc.nextInt();

                if (grade == 1) {
                    great.add(grade);
                } else if (grade == 2) {
                    good.add(grade);
                } else {
                    bad.add(grade);
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid data.");
            e.printStackTrace();
        }

        int totalAnswers = great.size() + good.size() + bad.size();
        double porcentGreat = ((double) great.size() / totalAnswers) * 100;
        double porcentGood = ((double) good.size() / totalAnswers) * 100;
        double porcentBad = ((double) bad.size() / totalAnswers) * 100;

        System.out.println("loading...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("-------------------------\n");
        System.out.println("Report of Great opinions:");
        System.out.println("Number: " + great.size());
        System.out.printf("Porcent: %.2f " , porcentGreat);
        System.out.println("-------------------------\n");
        System.out.println("Report of Good opinions:");
        System.out.println("Number: " + good.size());
        System.out.printf("Porcent: %.2f" , porcentGood);
        System.out.println("-------------------------\n");
        System.out.println("Report of Bad opinions:");
        System.out.println("Number: " + bad.size());
        System.out.printf("Porcent: %.2f" , porcentBad);


    }
}
