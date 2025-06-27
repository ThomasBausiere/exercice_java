package org.example;

public class GradingCalculator {
    public int score;
    public int attendancePercentage;

    public GradingCalculator(int score, int attendancePercentage) {
        score = score;
        attendancePercentage = attendancePercentage;
    }

    public char getGrade() {
        if(score > 90 && attendancePercentage > 70) return 'A';
        else if(score > 80 && attendancePercentage > 60) return  'B';
        else if (score > 60 && attendancePercentage > 60) return  'C';
        else return 'F';
    }
}
