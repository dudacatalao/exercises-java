package org.exercise.listFive.ex1;

public class Main {
    public static void main(String[] args) {
        InputOutput inputOutput = new InputOutput();

        Validation validation = new Validation(inputOutput);
        boolean notasValidas = validation.validacaoNotas();

        if (notasValidas) {
            Calculation calculation = new Calculation();

            switch (inputOutput.option) {
                case 1:
                    double media = calculation.calcularMediaAritmetica(inputOutput.nota, inputOutput.nota2);
                    System.out.println("Avarage: " + media);
                    System.out.println("-----------------------------------");

                    Result result = new Result();
                    result.mostrarResultado(media);
                    break;

                case 2:
                    double mediaPonderada = calculation.calcularMediaPonderada(inputOutput.nota, inputOutput.nota2, inputOutput.peso1, inputOutput.peso2);
                    System.out.println("Avarage: " + mediaPonderada);
                    System.out.println("-----------------------------------");

                    Result result2 = new Result();
                    result2.mostrarResultado(mediaPonderada);
                    break;
            }
        } else {
            while (!notasValidas) {
                inputOutput = new InputOutput();
                validation = new Validation(inputOutput);
                notasValidas = validation.validacaoNotas(); // corrigir
            }
        }
    }
}
