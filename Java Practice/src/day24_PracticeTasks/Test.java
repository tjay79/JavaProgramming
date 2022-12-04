package day24_PracticeTasks;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }

    public static int wordCount(String words){

        int wordCount=1;
        for(int i=0;i<words.length();i++){
            if(words.charAt(i)==' '){
                wordCount++;
            }
        }
        return wordCount;
    }
}
