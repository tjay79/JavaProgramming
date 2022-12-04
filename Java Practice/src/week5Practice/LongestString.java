package week5Practice;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter word 1");
        String word1 = scan.next();
        System.out.println("Please enter word 2");
        String word2= scan.next();

        int w1 = word1.length();
        int w2 = word2.length();

        if(w1>w2){
            System.out.println("Word 1 is longer");
        }else{
            System.out.println("Word 2 is longer");
        }
        scan.close();






    }
}
/*
write a program that asks user to enter two strings, and print out the
longest string
 */