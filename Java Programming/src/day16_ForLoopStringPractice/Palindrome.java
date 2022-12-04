package day16_ForLoopStringPractice;

public class Palindrome {

    public static void main(String[] args) {

        String word="Levall";
        String palindrome="";

        for(int i=word.length()-1;i>=0;i--) {

            palindrome += word.charAt(i);



        }
        System.out.println(word.equalsIgnoreCase(palindrome));

    }
}
