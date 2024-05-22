package org.exercise.listFive.ex3;

public class Loan {
    private double valueLoan;
    private double totalValue;
    private double portionValue;
    private double salary;

    public Loan(InputOutput inputOutput){
        this.valueLoan = inputOutput.valueLoan;
        this.salary = inputOutput.currentSalary;

        System.out.println("Calculating..");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public double getTotalValue(){
        this.totalValue = this.valueLoan + (this.valueLoan * 0.35);
        return this.totalValue;
    }

    public double getPortionValue(){
        this.portionValue = this.getTotalValue() / 24;
        return this.portionValue;
    }

    public String returnValues(){
        return String.format(
                "------------ Overview of the Loan ------------\n" +
                        "| Your salary:                   R$ %.2f |\n" +
                        "| Total amount:                  R$ %.2f |\n" +
                        "| Total amount with interest:    R$ %.2f |\n" +
                        "| Portion Value:                 R$ %.2f   |\n" +
                        "----------------------------------------------",
                this.salary, this.valueLoan ,this.getTotalValue(), this.getPortionValue()
        );
    }
}
