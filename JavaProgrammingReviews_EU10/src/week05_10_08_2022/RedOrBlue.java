package week05_10_08_2022;

import java.util.Scanner;

public class RedOrBlue {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a word");
        String word=scan.next();

        if(word.startsWith("red")){
            System.out.println("red");
        }else if(word.startsWith("blue")){
            System.out.println("blue");
        }else{
            System.out.println(" ");
        }


    }
}
