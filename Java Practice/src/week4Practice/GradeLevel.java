package week4Practice;

public class GradeLevel {

    public static void main(String[] args) {
        
        int gradeNum = 20;

        String grade =  (gradeNum >=1 && gradeNum <=18)? (gradeNum >=1 && gradeNum <=5) ? "Elementary school" : (gradeNum >=6 && gradeNum <=8)? "Middle school"
                : (gradeNum >=9 && gradeNum <=12)? "High school" : (gradeNum >=13 && gradeNum <=16)? "College" 
                : "Grad school" : "Invalid grade";
        System.out.println(grade);


    }
}
/*
Create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */