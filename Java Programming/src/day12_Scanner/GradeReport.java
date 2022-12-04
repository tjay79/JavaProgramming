package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a valid score");

        int score = scan.nextInt();
        String grade = "";

        if(score >=0 && score <=100){

            grade = (score <60)? "grade is an F" : (score >=60 && score <70)? "Grade in a D" : (score >=70 && score <80)? "Grade is a C"
                    : (score >=80 && score < 90)? "Grade is a B" : "Grade is an A";


        }else{
            grade="Invalid score";
        }

        System.out.println("grade = " + grade);


    }
}
