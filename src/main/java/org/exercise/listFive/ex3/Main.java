package org.exercise.listFive.ex3;

public class Main {
    public static void main(String[] args) {

        InputOutput inputOutput = new InputOutput();

        Validation validation = new Validation(inputOutput);
        boolean validValue = validation.validateLoan();

        if (validValue) {
            Loan loan = new Loan(inputOutput);
            System.out.println(loan.returnValues());
        }

    }
}
