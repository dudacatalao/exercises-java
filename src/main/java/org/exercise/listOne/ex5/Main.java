package org.exercise.listOne.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------------\n              Calculing minutes\n----------------------------------------------");
        System.out.println("Follow the instructions: \n1- You will enter the hours separately.\n2- First, the time, then the minutes and finally, the seconds. ");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------------------------");

        try {
            System.out.print("Insert the hours: ");
            int hours = sc.nextInt();
            int hoursToSeconds = hours * 3600;

            System.out.print("Insert the minutes: ");
            int minutes = sc.nextInt();
            int minutesToSeconds = minutes * 60;

            System.out.println(minutesToSeconds);

            System.out.print("Insert the seconds: ");
            float seconds = sc.nextInt();

            System.out.println("----------------------------------------------");
            System.out.println("Total Seconds: " + (hoursToSeconds + minutesToSeconds + seconds));

        }catch (Exception e){
            System.out.println("Invalid data.");
        }









    }
}
