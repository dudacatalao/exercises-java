package org.exercise.listThree.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Insert the balance: R$");
            float firstBalance = sc.nextFloat();

            System.out.println("Do you want to insert more balance?");
            String option = sc.next().toLowerCase();

        }while (){

        }



    }
}

//FUP que peça o saldo de várias pessoas.
// Ao final, mostre quantas delas apre-sentam saldo negativo e quantas delas positivos.
// Porém, deve ser classificado da seguinte forma:
// Se 50% ou mais do total de pessoas apresentaram saldo positivo, deve ser mostrado “Nenhum risco!”,
// caso contrário deve ser mostrado “Risco ao banco!”.
// Após informar o saldo da primeira pessoa, o programa deverá perguntar se o usuário deseja continuar informando saldos ou encerrar, mostrando a men-sagem.