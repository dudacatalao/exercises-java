package org.exercise.listFive.ex1;

import java.util.Scanner;

public class InputOutput {
    double nota;
    double nota2;
    float peso1;
    float peso2;
    int option;
    Scanner sc = new Scanner(System.in);

    public InputOutput() {
        System.out.print("Hello, welcome\n");
        System.out.print("What average do you want to calculate? \n[1] Arithmetic\n[2] Weighted\n-> ");
        this.option = sc.nextInt();

        switch (this.option) {
            case 1:
                System.out.print("Insert the first grade: ");
                this.nota = sc.nextDouble();

                System.out.print("Insert the second grade: ");
                this.nota2 = sc.nextDouble();
                System.out.println("-----------------------------------");

                break;

            case 2:
                System.out.print("Insert the first grade: ");
                this.nota = sc.nextDouble();
                System.out.print("Insert the weight: ");
                this.peso1 = sc.nextFloat();

                System.out.print("Insert the second grade: ");
                this.nota2 = sc.nextDouble();
                System.out.print("Insert the weight: ");
                this.peso2 = sc.nextFloat();
                System.out.println("-----------------------------------");

                break;
        }
    }

    public String returnValuesString() {
        if (peso1 != 0 && peso2 != 0) {
            return String.format("Nota 1: %.2f\nNota 2: %.2f\nPeso 1:%.2f\nPeso 2: %.2f", this.nota, this.nota2, this.peso1, this.peso2);
        } else {
            return String.format("Nota 1: %.2f\nNota 2: %.2f", this.nota, this.nota2);
        }
    }
}
