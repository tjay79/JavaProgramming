package day16_ForLoopStringPractice;

public class FindUniques {

    public static void main(String[] args) {

        String word="aabccdeerr";
        String result="";

        for(int i =0; i<=word.length()-1; i++){
            char ch= word.charAt(i);
            if(word.indexOf(ch)==word.lastIndexOf(ch)){
                result+=ch;
            }
        }
        System.out.println("result = " + result);


    }
}
