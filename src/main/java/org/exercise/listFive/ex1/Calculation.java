package org.exercise.listFive.ex1;

public class Calculation {
    public Calculation(){
        System.out.println("Calculating your average..");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    double calcularMediaAritmetica(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }

    double calcularMediaPonderada(double nota1, double nota2, float peso1, float peso2){
        return ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);
    }
}
