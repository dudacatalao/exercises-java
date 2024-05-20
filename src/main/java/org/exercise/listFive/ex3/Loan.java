package org.exercise.listFive.ex3;

public class Loan {
    double valueLoan;
    double totalValue;
    double portionValue;

    public Loan(InputOutput inputOutput){
        this.valueLoan = inputOutput.valueLoan;
    }

    double getTotalValue(){
        return this.totalValue = this.valueLoan + ( this.valueLoan * 3.5);
    }

    double getPortionValue(){
        return this.portionValue = this.totalValue / 24;
    }

    String returnValues(){
        return String.format(
                "------------ Overview  of the Loan------------\n" +
                        "| Your salary:                   R$ %.2f        |\n" +
                        "| Total amount with interest:    R$ %.2f        |\n" +
                        "| IRPF discount:        R$ %.2f        |\n" +
                        "| Health Plan:          R$ %.2f        |\n" +
                        "| Additional Hours:     R$ %.f        |\n" +
                        "| TOTAL SALARY:         R$ %.2f        |\n" +
                        "-----------------------------------------",
                this.salary, discountINSS(), discountIRPF(), healthPlan(), additionExtraHour(), calculingFinalSalary()
        );
    }
}
