package day10_NestedIf;

public class TernariesNestedIf {

    public static void main(String[] args) {

        int score = 134;

        String grade = (score <= 100 && score >= 0) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great"
                : (score >= 70) ? "Good" : (score >= 60) ? "Passed" : "Failed" : "Invalid score";

        System.out.println(grade);


    }
}
