package week5Practice;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();
        int length = word.length();
        String reverse= "";

        for (int i = length-1; i >=0 ; i--) {
            char letter = word.charAt(i);
            reverse = reverse+letter;
        }
        System.out.println(word.equals(reverse));





    }
}
/*
Write a program that can check if the given String is palindrome
Ex:
input:
Level
output:
true
input:
Anna
output:
true
 */