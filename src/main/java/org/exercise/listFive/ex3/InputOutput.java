package org.exercise.listFive.ex3;

import java.util.Scanner;

public class InputOutput {
    double currentSalary;
    double valueLoan;
    Scanner sc = new Scanner(System.in);

    public InputOutput(){
        System.out.println("Hello, welcome");
        System.out.println("Insert your current salary: R$");
        this.currentSalary = sc.nextDouble();

        System.out.println("Insert the value of the loan: R$");
        this.valueLoan = sc.nextDouble();
    }

}
