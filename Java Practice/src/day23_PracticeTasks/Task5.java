package day23_PracticeTasks;

public class Task5 {

    public static void main(String[] args) {

        gradesFromScore(56);

    }

    public static void gradesFromScore(int score){

      String grade=  (score<=100&&score>=90)?"A":(score<=89&&score>=80)?"B":(score<=79&&score>=70)?"C":(score<=69&&score>=60)?"D":"F";

        System.out.println(grade);
    }
}
/*
create a method that can calculate the grade of the student based
on the score
 */
