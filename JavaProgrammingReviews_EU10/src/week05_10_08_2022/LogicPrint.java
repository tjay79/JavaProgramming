package week05_10_08_2022;

import java.util.Scanner;

public class LogicPrint {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word=scan.next();
        String result=""+word.charAt(word.length()-2)+word.charAt(word.length()-1);

        System.out.println(result+result+result);





    }
}
