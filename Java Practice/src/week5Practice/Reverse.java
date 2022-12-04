package week5Practice;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 5 letter word");
        String word = scan.next();

        int wordLength = word.length();

        if(wordLength==5){

            System.out.println("" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));



        }else if(wordLength<5){
            System.out.println("Too short!");
        }else{
            System.out.println("Too long!");
        }





    }
}
/*
Create a class called Reverse, write a program that will reverse a
string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
 */