package org.exercise.ListOne.ex1;

public class Register {
    String fullName;
    int dateOfBirth;
    double salaryExpectation;
    String levelOfEducation;
    String intendedPosition;
    boolean driverLicense;

    Register(String fullName, int dateOfBirth, double salaryExpectation, String levelOfEducation, String intendedPosition, boolean driverLicense){
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.salaryExpectation = salaryExpectation;
        this.levelOfEducation = levelOfEducation;
        this.intendedPosition = intendedPosition;
        this.driverLicense = driverLicense;
    }

    String returnResumeRegister(){
        return String.format("Your candidacy:\nName: %s\nDate of Birth: %d\nSalary Expectation: %.2f\nLevel Of Education: %s\nIntended Position: %s\nHave a driver's license: %b", this.fullName, this.dateOfBirth, this.salaryExpectation, this.levelOfEducation, this.intendedPosition, this.driverLicense);
    }


}
