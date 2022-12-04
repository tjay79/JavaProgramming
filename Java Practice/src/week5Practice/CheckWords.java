package week5Practice;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word 1");
        String word1 = scan.next();
        System.out.println("Enter word 2");
        String word2 = scan.next();
        System.out.println("Enter word 3");
        String word3 = scan.next();
        int w1 = word1.length();
        int w2 = word2.length();
        int w3 = word3.length();

        if(w1== w2 && w2==w3){
            System.out.println("All words are the same length");
        }else if(w1==w2&&w2!=w3|| w1==w3&&w1!=w2) {
            System.out.println("Not same or different lengths");
        }else if(w2==w3&&w1!=3){
            System.out.println("Not same or different lengths");
        }else{
            System.out.println("All different lengths");
        }






    }
}
/*
Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"
 */