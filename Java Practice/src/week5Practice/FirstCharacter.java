package week5Practice;

import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();

        int first = word.charAt(0);

        if(first >= 'A'&& first<='Z'){
            System.out.println("First character is uppercase");
        }else if(first>='a'&&first<='z'){
            System.out.println("First character is lowercase");
        }else if(first>='0' && first <='9'){
            System.out.println("First character is a digit");
        }else{
            System.out.println("First character is a special character");
        }



    }
}
/*
Ask user to enter a word,
if the word starts with digits, print "first character is digit"
if the word starts with uppercase letters, print "first character
is lowercase letter"
if the word starts with lowercase letters, print "first character
is uppercase letter"
if the word starts with special characters, print "first character
is special character"
HINT: 1. you need charAt() method
6. Ascii Table
 */
