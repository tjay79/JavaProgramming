package day23_PracticeTasks;

import java.util.Arrays;

public class Task17 {

    public static void main(String[] args) {

        anagram("silent", "listens");

    }

    public static void anagram(String word1, String word2){

        boolean anagrams= false;
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        char[] words1=word1.toCharArray();
        char[] words2= word2.toCharArray();
        Arrays.sort(words1);
        Arrays.sort(words2);

        anagrams=Arrays.equals(words1,words2);
        if(anagrams){
            System.out.println(word1+" and "+word2+" are anagrams");
        }else{
            System.out.println(word1+" and "+word2+" are not anagrams");
        }




    }
}
