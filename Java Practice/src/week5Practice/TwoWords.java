package week5Practice;

import java.util.Scanner;

public class TwoWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();
        System.out.println("Enter another word");
        String word2 = scan.next();

        System.out.println(word.substring(1)+word2.substring(1));

        scan.close();





    }
}
