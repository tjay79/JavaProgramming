package week3Practice;

public class SchoolType {

    public static void main(String[] args) {
        String name = "Anna";
        int grade = 18;
        boolean elementary = grade >=1 && grade <=5;
        boolean middle = grade >=6 && grade <=8;
        boolean high = grade >=9 && grade <=12;
        boolean college = grade >=13 && grade <=16;

        if(elementary){
            System.out.println(name + " is in Elementary school");
        }else if(middle){
            System.out.println(name + " is in Middle school");
        }else if(high){
            System.out.println(name + " is in High school");
        }else if(college){
            System.out.println(name + " is in College");
        }else{
            System.out.println(name + " is in Grad school");
        }

    }
}
/*
Given a number(byte) grade level determine and print which
school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
Assume that the given number is 1 ~ 18
 */