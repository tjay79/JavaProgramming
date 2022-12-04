package week5Practice;

import java.util.Scanner;

public class SameLetters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();
        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);

        if(first==last){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }







    }
}
/*
write a program that can check if the first and last characters of the
string are same
ex:
level
output:
same
 */