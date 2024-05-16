package org.exercise.listFive.ex1;

public class Main {
    public static void main(String[] args){

        // instanciando o método de entrada e em seguida a validação das notas retornadas
        InputOutput inputOutput = new InputOutput();

        Validation validation = new Validation(inputOutput);
        boolean notasValidas = validation.validacaoNotas();

        // verifica se a validação retornou um valor verdadeiro
        if(notasValidas) {
            Calculation calculation = new Calculation();

            switch (inputOutput.option) {
                case 1:
                    //calcula a média aritmética, caso seja a opção do usuário, e mostra o resultado
                    double media = calculation.calcularMediaAritmetica(inputOutput.nota, inputOutput.nota2);
                    System.out.print("Average: " + media);
                    System.out.println("\n-----------------------------------");

                    Result result = new Result();
                    result.mostrarResultado(media);
                    break;

                case 2:
                    //calcula a média ponderada, caso seja a opção do usuário, e mostra o resultado
                    double mediaPonderada = calculation.calcularMediaPonderada(inputOutput.nota, inputOutput.nota2, inputOutput.peso1, inputOutput.peso2);
                    System.out.print("Average: " + mediaPonderada);
                    System.out.println("\n-----------------------------------");

                    Result result2 = new Result();
                    result2.mostrarResultado(mediaPonderada);
                    break;
            }
        }

    }
}
