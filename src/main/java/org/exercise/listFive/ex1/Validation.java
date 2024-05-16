package org.exercise.listFive.ex1;

import java.lang.Thread;

public class Validation {
    double nota;
    double nota2;
    InputOutput inputOutput;

    public Validation(InputOutput inputOutput) {
        this.nota = inputOutput.nota;
        this.nota2 = inputOutput.nota2;
        this.inputOutput = inputOutput;
    }

    boolean validacaoNotas() {
        System.out.println("Starting validation process..");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (nota < 0 || nota > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println("One or both of the notes are invalid.");
            System.out.println("Invalid input. Please try again.");
            System.out.println("-----------------------------------");
            return false;
        } else {
            System.out.println("The notes are valid!");
            System.out.println("-----------------------------------");
            return true;
        }
    }
}
