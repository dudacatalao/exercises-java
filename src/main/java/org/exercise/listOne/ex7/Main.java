package org.exercise.listOne.ex7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("System Payment");
        try {
            System.out.print("Insert your name: ");
            String name = sc.nextLine();

            System.out.print("Insert the month: ");
            String month = sc.next();

            System.out.print("Insert the number of cars you sold this month: ");
            int numberOfCars = sc.nextInt();

            System.out.print("Insert the total value of sales: R$");
            double totalSales = sc.nextDouble();

            Salary salary = new Salary(name, month, numberOfCars,totalSales);

            System.out.println("-------------------------------------------");
            System.out.println("Generating Report...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("-------------------------------------------");
            System.out.println(salary.resumeSalary());

        }catch (InputMismatchException e){
            System.out.println("Invalid data.");
        }


    }
}
