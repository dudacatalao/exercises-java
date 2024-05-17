package org.exercise.listFive.ex2;

public class Validation {
    double salary;

    public Validation(InputOutput inputOutput){
        this.salary = inputOutput.salary;
    }

    boolean validationSalary(){
        System.out.println("------------------------------------------");
        System.out.println("Starting validation process..");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(this.salary < 500 || this.salary > 30000){
            System.out.println("Invalid value\nInsert Again.");
            return false;
        }else{
            System.out.println("Valid value.");
            return true;
        }
    }

}
