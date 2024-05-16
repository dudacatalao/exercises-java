package org.exercise.listFive.ex1;

public class Result {
    double media;

    public Result() {
        System.out.println("\nGenerating result..");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    void mostrarResultado(double media){
        if(media > 7){
            System.out.println("Congratulations, you have been approved!");
        }else {
            System.out.println("What a shame, you failed.");
        }
    }
}
