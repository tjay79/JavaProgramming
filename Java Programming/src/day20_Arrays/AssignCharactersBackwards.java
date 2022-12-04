package day20_Arrays;

import java.util.Arrays;

public class AssignCharactersBackwards {

    public static void main(String[] args) {
        char[] letters=new char[26];

        char ch='Z';

        for(int i= 0;i< letters.length;i++,ch--){
            letters[i]=ch;
        }
        System.out.println(Arrays.toString(letters));





    }
}
