package day28_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>();
        ArrayList<Integer> gradeOfB = new ArrayList<>();
        ArrayList<Integer> gradeOfC = new ArrayList<>();
        ArrayList<Integer> gradeOfD = new ArrayList<>();
        ArrayList<Integer> gradeOfF = new ArrayList<>();

        for (Integer score : scores) {

            if(score<=100&&score>=90){
                gradeOfA.add(score);
            }else if(score>=80&&score<=89){
                gradeOfB.add(score);
            }else if(score>=70&&score<=79){
                gradeOfC.add(score);
            }else if(score>=60&&score<=69){
                gradeOfD.add(score);
            }else{
                gradeOfF.add(score);
            }
        }

        System.out.println("The total number of A´s is "+gradeOfA.size());
        System.out.println("The total number of B´s is "+gradeOfB.size());
        System.out.println("The total number of C´s is "+gradeOfC.size());
        System.out.println("The total number of D´s is "+gradeOfD.size());
        System.out.println("The total number of F´s is "+gradeOfF.size());




    }
}
/*

8. Given the following arraylists:
ArrayList<Integer>  scores = new ArrayList<>();
scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55,
45, 73, 73, 35, 47));
ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~
100
ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
Write a program that can count the total numbers of grade A, B, C,
D and F
 */
