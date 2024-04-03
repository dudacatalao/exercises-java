package org.exercise.listTwo.ex7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n" +
                "█▀█ █░█ █▀▀ █▀ ▀█▀ █ █▀█ █▄░█ █▀   ▄▀█ █▄░█ █▀▄   ▄▀█ █▄░█ █▀ █░█░█ █▀▀ █▀█ █▀\n" +
                "▀▀█ █▄█ ██▄ ▄█ ░█░ █ █▄█ █░▀█ ▄█   █▀█ █░▀█ █▄▀   █▀█ █░▀█ ▄█ ▀▄▀▄▀ ██▄ █▀▄ ▄█");

        System.out.print("[1] Which programming language is known for its versatility and is commonly used for mobile app development, database management systems, and web development?" +
                "\n[2] What is one of the main programming languages for web development?\nWhich question do you wnat to answer?\n->");
        int option = sc.nextInt();

        System.out.println("------------------------------------------------------------------------------");
        switch (option){
            case 1:
                try {
                    System.out.println("Which programming language is known for its versatility and is commonly used for mobile app development, database management systems, and web development?" +
                            "\n[A] Java\n[B] Python\n[C] JavaScript\n->");
                    String answer = sc.next().toUpperCase();

                    if(answer.equals("C")){
                        System.out.println("You got it right, you can withdraw your bonus at Shostners and Shostners.");
                    }else{
                        System.out.println("You didn't get it right, but try again next time.");
                    }
                    break;
                }catch (InputMismatchException e){
                    System.out.println("Invalid data.");
                }

            case 2:
                try {
                    System.out.println("What is one of the main programming languages for web development?" +
                            "\n[A] C++\n[B] Java\n[C] HTML\n->");
                    String answerSecond = sc.next().toUpperCase();

                    if(answerSecond.equals("B")){
                        System.out.println("You got it right, you can withdraw your bonus at Shostners and Shostners.");
                    }else{
                        System.out.println("You didn't get it right, but try again next time.");
                    }
                    break;
                }catch (InputMismatchException e){
                    System.out.println("Invalid data.");
                }

        }


    }
}

//Elabore 02 perguntas com 03 alternativas de resposta cada. O programa deverá perguntar ao usuário se ele quer
//        responder a pergunta 01 ou 02. Exiba a pergunta e as alternativas correspondentes. Caso o usuário acerte a resposta,
//        informe “Você acertou, pode retirar seu bônus na Shostners and Shostners”. Caso a pessoa erre, informar “Você não acertou,
//        mas tente novamente numa próxima”.
//
//        Desafio: você deve considerar que o usuário poderá responder “a” ou “A” para a resposta, por exemplo.
//        Mas, no seu código, considere mininimzar a resposta do usuário sempre. Pesquise o método da classe String que
//        transforma o texto em minúsculo.
//
