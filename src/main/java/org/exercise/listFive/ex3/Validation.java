package org.exercise.listFive.ex3;

public class Validation {
    double currentSalary;
    double valueLoan;
    public Validation(InputOutput inputOutput){
        this.currentSalary = inputOutput.currentSalary;
        this.valueLoan = inputOutput.valueLoan;
    }

    boolean validationValues(){
        double lalala = this.valueLoan / 24;
        double lelele = this.currentSalary * 0.15;
        if (lalala > lelele || this.valueLoan > 200000){
            System.out.println("You can't take out the loan.");
            return false;
        }else{
            System.out.println("Congratulation, you can take out the loan!");
            return true;
        }
    }
}
