package day15_ForLoop;

import java.util.Scanner;

public class StartsAndEndsX {

    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();

        String result = word.replace("x","a").replace("X","a");

        System.out.println(result);




    }
}
