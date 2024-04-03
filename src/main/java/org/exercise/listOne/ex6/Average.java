package org.exercise.listOne.ex6;

public class Average {
    float gradeOne;
    float gradeTwo;

    Average(float gradeOne, float gradeTwo){
        this.gradeOne = gradeOne;
        this.gradeTwo = gradeTwo;
    }
    double weightedAverage(){
        return (gradeOne * 0.4) + (gradeTwo * 0.6);
    }
}
