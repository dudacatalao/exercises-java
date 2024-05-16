package org.exercise.listFive.ex2;

import java.util.Scanner;

public class InputOutput {
    double salary;
    int extraHour;
    Scanner sc = new Scanner(System.in);

    public InputOutput(){
        System.out.println("Hello, welcome");
        System.out.print("Insert your monthly gross salary: R$");
        this.salary = sc.nextDouble();

        System.out.print("Enter the total amount of overtime you worked (In hours): ");
        this.extraHour = sc.nextInt();
    }
}
