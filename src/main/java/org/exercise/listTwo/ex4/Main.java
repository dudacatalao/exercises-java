package org.exercise.listTwo.ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\uD835\uDD65\uD835\uDD63\uD835\uDD52\uD835\uDD67\uD835\uDD56\uD835\uDD5D \uD835\uDD52\uD835\uDD58\uD835\uDD56\uD835\uDD5F\uD835\uDD54\uD835\uDD6A");
        System.out.println("--------------------------------");

        double baseValue = 3000;
        String lunchDinner = "";
        try {
            System.out.print("Where do you want to pass your vacation?\n[1] Maceió\n[2] Porto de Galinhas\n->");
            int destiny = sc.nextInt();

            switch (destiny){
                case 1:
                    System.out.println("Uhull, good choice\nLoading the options...");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.print("Do you want your package with dinner and lunch included?\n[1] Yes, I do.\n[2] No, I don't\n->");
                    int lunch = sc.nextInt();

                    if (lunch == 1){
                        lunchDinner = "Included in";
                    }else {
                        lunchDinner = "Not included";
                    }

                    switch (lunch){
                        case 1:
                            System.out.printf("Destiny: %s\nIncluding lunch and dinner: %s\nTotal Price: R$ %.2f", destiny,lunchDinner,baseValue + baseValue);
                            System.out.println("Confirm?\n[1] Yes\n[2] No\n->");
                            int confirm = sc.nextInt();

                            if (confirm == 1){
                                System.out.println("Good Travel!!!");
                            }else {
                                System.out.println("Make the process again, please.");
                            }
                            break;
                        case 2:
                            System.out.printf("Destiny: %s\nIncluding lunch and dinner: %s\nTotal Price: R$ %.2f", destiny,lunchDinner,baseValue + (baseValue * 0.85));
                            System.out.println("Confirm?\n[1] Yes\n[2] No\n->");
                            int confirmTwo = sc.nextInt();

                            if (confirmTwo == 1){
                                System.out.println("Good Travel!!!");
                            }else {
                                System.out.println("Make the process again, please.");
                            }
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Uhull, good choice\nLoading the options...");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.print("Do you want your package with dinner and lunch included?\n[1] Yes, I do.\n[2] No, I don't\n->");
                    int dinner = sc.nextInt();

                    if (dinner == 1){
                        lunchDinner = "Included in";
                    }else {
                        lunchDinner = "Not included";
                    }

                    switch (dinner){
                        case 1:
                            System.out.printf("Confirm Information:\nDestiny: %s\nIncluding lunch and dinner: %s\nTotal Price: R$ %.2f", destiny,lunchDinner,baseValue + (baseValue * 0.60));
                            break;
                        case 2:
                            System.out.printf("Confirm Information:\nDestiny: %s\nIncluding lunch and dinner: %s\nTotal Price: R$ %.2f", destiny,lunchDinner,baseValue + (baseValue * 0.45));
                            break;
                    }
                    break;

            }

        }catch (InputMismatchException e){
            System.out.println("Invalid data.");
        }
    }
}
