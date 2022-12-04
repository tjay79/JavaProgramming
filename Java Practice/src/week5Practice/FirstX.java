package week5Practice;

import java.util.Scanner;

public class FirstX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word =scan.next();
        String isX = word.substring(0,1);

        if(isX.equals("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }





    }
}
/*
Ask user to enter a word. If the work starts with x, print the
word without x.
Input:
xcode
Output:
code
 */
