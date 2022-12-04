package week5Practice;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();
        int length = word.length();
        String reverse="";

        for (int i = length-1; i >=0 ; i--) {

            reverse =reverse +""+ word.charAt(i);

        }
        System.out.println(reverse);




    }
}
/*
Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW
 */