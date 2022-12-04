package week5Practice;

import java.util.Scanner;

public class ThreeLetterString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");;
        String word = scan.next();

        int wordLength = word.length();

        if(wordLength==0){
            System.out.println("Word is empty");
        }else if(wordLength<=3){
            System.out.println(word.substring(0));
        }else{
            System.out.println(word.substring(word.length()-3));
        }







    }
}
/*
Write a method that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three
characters
if the string has less than or equal 3 characters, print the
string itself
 */