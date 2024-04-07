package org.exercise.listThree.ex5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueInsertion = true;
        int positive = 0;
        int negative = 0;

        do {
            try{

            }catch (InputMismatchException e){

            }
            System.out.print("Insert the balance: R$");
            float balance = sc.nextFloat();

            System.out.println("Do you want to insert more balance? (yes/no)");
            String option = sc.next().toLowerCase();

            if (balance > 0){
                positive++;
            }else{
                negative++;
            }

            if (option.equals("no")) {
                continueInsertion = false;
            }

        } while (continueInsertion);

        int total = positive + negative;
        double porcentPositive = ((double) positive / total) * 100;
        double porcentNegative = ((double) negative / total) * 100;

        if (porcentPositive > porcentNegative){
            System.out.println("No risk!");
        }else{
            System.out.println("Risk to the bank.");
        }


    }
}

//FUP que peça o saldo de várias pessoas. Ao final, mostre quantas delas apre-
//sentam saldo negativo e quantas delas positivos. Porém, deve ser classificado da
//seguinte forma: Se 50% ou mais do total de pessoas apresentaram saldo positivo,
//deve ser mostrado “Nenhum risco!”, caso contrário deve ser mostrado “Risco ao
//banco!”. Após informar o saldo da primeira pessoa, o programa deverá perguntar
//se o usuário deseja continuar informando saldos ou encerrar, mostrando a men-
//sagem.