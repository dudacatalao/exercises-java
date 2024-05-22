package org.exercise.listFive.ex3;

public class Validation {
    double currentSalary;
    double loanAmount;

    public Validation(InputOutput inputOutput) {
        this.currentSalary = inputOutput.currentSalary;
        this.loanAmount = inputOutput.valueLoan;
    }

    public boolean validateLoan() {
        System.out.println("Starting validation process..");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        final double monthsInYear = 12;
        final double maxPercentage = 0.15;
        final double maxLoan = 200000;

        double monthlyPayment = this.loanAmount / monthsInYear;
        double maxAllowedLoan = this.currentSalary * maxPercentage;

        if (monthlyPayment > maxAllowedLoan || this.loanAmount > maxLoan) {
            System.out.println("You can't take out the loan.");
            return false;
        } else {
            System.out.println("Congratulations, you can take out the loan!");
            return true;
        }
    }
}
