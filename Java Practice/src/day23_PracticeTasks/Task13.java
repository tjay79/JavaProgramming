package day23_PracticeTasks;

import java.util.Arrays;

public class Task13 {

    public static void main(String[] args) {

        printEveryChar("Anthony");

    }

    public static void printEveryChar(String a){

        for(int i=0;i<=a.length()-1;i++){

            System.out.print(a.charAt(i)+" ");
        }

    }
}
/*
create a method named printEachChar that can print each
characters of a string
 */
