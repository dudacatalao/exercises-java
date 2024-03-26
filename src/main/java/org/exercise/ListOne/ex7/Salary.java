package org.exercise.ListOne.ex7;

public class Salary {
    String name;
    String month;
    int qtdCars;
    double totalSales;

    Salary(String name, String month,int qtdCars, double totalSales){
        this.qtdCars = qtdCars;
        this.totalSales = totalSales;
        this.name = name;
        this.month = month;
    }

    double commissionCars(){
        return qtdCars * 350;
    }

    double porcentCars(){
        return totalSales * (0.001);
    }

    double calculingSalary(){
        return 1500 + commissionCars() + porcentCars();
    }

    String resumeSalary(){
        return String.format("Employee name: %s\nMonth: %s\nNumber of Cars: %d\nTotal Sales: %.2f\nCars commission: %.2f\nCars Porcent: %.2f\nMonthly salary: %.2f",
                this.name, this.month, this.qtdCars, this.totalSales, this.commissionCars(), this.porcentCars(), this.calculingSalary());
    }


}
