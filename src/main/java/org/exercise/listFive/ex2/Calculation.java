package org.exercise.listFive.ex2;

public class Calculation {
    double salary;
    int extraHour;
    double finalSalary;

    public Calculation(InputOutput inputOutput){
        this.salary = inputOutput.salary;
        this.extraHour = inputOutput.extraHour;
        this.finalSalary = calculingFinalSalary();

        System.out.println("Calculating..");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    double discountINSS(){
        return this.salary * 0.20;
    }

    double discountIRPF(){
        return this.salary * 0.10;
    }

    double healthPlan(){
        return this.salary * 0.05;
    }

    double additionExtraHour(){
        double normalHourlyRate = this.salary / 160;
        double extraHourlyRate = normalHourlyRate * 1.5;
        double extraPay = this.extraHour * extraHourlyRate;

        return extraPay;
    }

    double calculingFinalSalary() {
        double finalSalary = this.salary - (discountINSS() + discountIRPF() + healthPlan());
        double extra = finalSalary + additionExtraHour();
        this.finalSalary = extra;
        return this.finalSalary;
    }

    String returnOlerite(){
        return String.format(
                "------------ Monthly Oleritis ------------\n" +
                        "| Gross Salary:         R$ %.2f        |\n" +
                        "| INSS discount:        R$ %.2f        |\n" +
                        "| IRPF discount:        R$ %.2f        |\n" +
                        "| Health Plan:          R$ %.2f        |\n" +
                        "| Additional Hours:     R$ %.2f        |\n" +
                        "| TOTAL SALARY:         R$ %.2f        |\n" +
                        "-----------------------------------------",
                this.salary, discountINSS(), discountIRPF(), healthPlan(), additionExtraHour(), calculingFinalSalary()
        );
    }

}
