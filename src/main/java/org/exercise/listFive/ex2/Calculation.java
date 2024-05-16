package org.exercise.listFive.ex2;

public class Calculation {
    double salary;
    int extraHour;

    public Calculation(InputOutput inputOutput){
        this.salary = inputOutput.salary;
        this.extraHour = inputOutput.extraHour;
    }

    double discountINSS(){
        return this.salary - (this.salary - 0.20);
    }
    double discountIRPF(){
        return this.salary - (this.salary - 0.10);
    }
    double healthPlan(){
        return this.salary - (this.salary - 0.05);
    }
    double additionExtraHour(){
        //fazer o calculo
    }
}
