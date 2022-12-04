package week5Practice;

import java.util.Scanner;

public class TwoWordsTogether {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1 = scan.next();
        System.out.println("Enter second word");
        String word2 = scan.next();
        String w1 = word1.substring(word1.length()-1);
        String w2 = word2.substring(0,1);

        if(w1.equals(w2)){
            System.out.println(word1 + word2.substring(1));
        }else{
            System.out.println(word1 + " " + word2);
        }





    }
}
/*
Ask user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the
last letter is the same,
print that character once.
Input:
one
eight
Output:
oneight
 */