package org.exercise.listTwo.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            String color1 = "\u001B[35m";
            String reset = "\u001B[0m";

            System.out.println(color1 + "-----------------------------------------\n         Classification of Ages\n-----------------------------------------" + reset);

            System.out.print("Insert here your age: ");
            int age = sc.nextInt();

            if( age>= 0 && age <= 14){
                System.out.println("You are a child.");
            } else if (age >=15 && age <= 17) {
                System.out.println("You are a teenager.");
            } else if (age >= 18 && age <= 29) {
                System.out.println("You are a young adult.");
            }else if (age >=30 && age <= 59){
                System.out.println("You are a adult.");
            }else if(age >= 6){
                System.out.println("You are a elderly.");
            }else{
                System.out.println("Insert the correct age.");
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid data");
        }


    }
}
