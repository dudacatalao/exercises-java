package org.exercise.ListOne.ex1;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Thread;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------BOSCH SYSTEM----------------");
        System.out.println("|      Welcome to our candidate system     |");
        System.out.println("--------------------------------------------");
        System.out.println("Let's start you register...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.print("Insert here your full name: ");
            String name = sc.nextLine();

            System.out.print("Insert here your date of Birth: ");
            int dateOfBirth = sc.nextInt();
            sc.nextLine();

            System.out.print("Insert here your salary expectation: R$");
            double salaryExpectation = sc.nextDouble();

            System.out.print("Insert here your level of education: ");
            String levelOfEducation = sc.next();

            System.out.print("Insert here your intended position: ");
            String intendedPosition = sc.next();

            System.out.println("Do you have driver Licence: \n[1] Yes, I do.\n[2] No, I don't.");
            String hasDriverLicenceInput = sc.next();
            boolean driverLicence = hasDriverLicenceInput.equals("1");

            System.out.println("--------------------------------------------");
            System.out.println("Generating your registration in our system..");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("--------------------------------------------");
            Register candidate = new Register(name, dateOfBirth, salaryExpectation, levelOfEducation, intendedPosition, driverLicence);
            System.out.println(candidate.returnResumeRegister());

        }catch (InputMismatchException e){
            System.out.println("Invalid data.");
        }
    }
}
