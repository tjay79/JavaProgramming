package week05_10_08_2022;

import java.util.Scanner;

public class FirstTwoLetters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word= scan.next();

        word=word.toUpperCase();

        System.out.println(""+word.charAt(0)+word.charAt(1));
    }
}
