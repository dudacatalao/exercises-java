package org.exercise.listThree.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> positiveNumbers = new ArrayList<>();

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

        System.out.print("[1] Even numbers\n[2] Odd numbers\n[3] Negative numbers\n[4] Positive numbers\nWhich option do you want to see?\n-> ");
        int option = sc.nextInt();

        switch (option){
            case 1:
                System.out.println("Even Numbers:");
                for (int i = 0; i < evenNumbers.size(); i++) {
                    System.out.println(evenNumbers.get(i));
                }
                break;
            case 2:
                System.out.println("Odd Numbers:");
                for (int i = 0; i < oddNumbers.size(); i++) {
                    System.out.println(oddNumbers.get(i));
                }
                break;
            case 3:
                System.out.println("Negative Numbers:");
                for (int i = 0; i < negativeNumbers.size(); i++) {
                    System.out.println(negativeNumbers.get(i));
                }
                break;
            case 4:
                System.out.println("Positive Numbers:");
                for (int i = 0; i < positiveNumbers.size(); i++) {
                    System.out.println(positiveNumbers.get(i));
                }
                break;
        }

    }
}


//FUP que peça 10 números ao usuário. Em seguida, pergunte a ele o que ele deseja saber (utilizando a estrutura switch):
//a. Quantos números pares?
//b. Quantos números ímpares?
//c. Quantos negativos?
//d. Quantos positivos?