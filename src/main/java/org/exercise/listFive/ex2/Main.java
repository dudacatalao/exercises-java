package org.exercise.listFive.ex2;

public class Main {
    public static void main(String[] args) {
        InputOutput inputOutput = new InputOutput();

        Validation validation = new Validation(inputOutput);
        boolean validMoney = validation.validationSalary();

        if (validMoney){
            Calculation calculation = new Calculation(inputOutput);
            System.out.println(calculation.returnOlerite());
        }
    }
}
