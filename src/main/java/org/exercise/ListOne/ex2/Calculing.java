package org.exercise.ListOne.ex2;

public class Calculing {
    double number1;
    double number2;

    Calculing(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    double sumNumbers(){
        return number1 + number2;
    }
    double subtraction(){
        return number1 - number2;
    }
    double multiplicationNumbers(){
        return number2 * number1;
    }
    double division() {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
    double highNumber(){
        return Math.pow(number1,number2);
    }
    double restDivision(){
        return number1 % number2;
    }

    String resumeCounts(){
        return String.format("First number: %.2f\nSecond number: %.2f\nSum of the Numbers: %.2f\nSubtraction: %.2f\nMultiplication: %.2f\nDivision: %.2f\nNumber 1 raised to number 2: %.2f\nRest of Division: %.2f",this.number1,this.number2, this.sumNumbers(), this.subtraction(), this.multiplicationNumbers(), this.division(), this.highNumber(),this.restDivision());
    }
}
