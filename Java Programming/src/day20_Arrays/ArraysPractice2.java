package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];

        for (char i ='A',j=0; i<='Z'&& j<letters.length; i++,j++){//i: index number 0~last index
            letters[j]=i;
            /*
            for(int i=0,j='A'; i < letters.length;i++,j++){
            letters[i] = (char)j;                //must assign to char if you want to get a character back, otherwise it will give you an int

            easier way:
            char ch='A';
            for(int i=0; i<letters.length; i++){
            letters[i]=ch++;
            }
                         */

        }
        System.out.println(Arrays.toString(letters));






    }
}
