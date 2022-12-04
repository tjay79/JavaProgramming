package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Collections.swap(numbers,0,numbers.size()-1);

        System.out.println(numbers);

        System.out.println("___________________________");

        ArrayList<Integer> num= new ArrayList<>();

        num.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        int size=num.size();

        num.removeAll(Arrays.asList(0));

        int newSize= num.size();

        int totalNumberOfZeros=size-newSize;

        System.out.println(totalNumberOfZeros);

        for(int i=0;i<totalNumberOfZeros;i++){
            num.add(0);
        }

        System.out.println(num);

        System.out.println("_____________________________________");

        String str="ABCD123$%#@&456EFG";

        ArrayList<Character> list=new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            list.add(str.charAt(i));
        }

        ArrayList<Character> letters=new ArrayList<>(list);//add all the characters

        letters.removeIf(p->!Character.isLetter(p));//remove if the character is not a letter

        System.out.println(letters);

        ArrayList<Character> digits=new ArrayList<>(list);

        digits.removeIf(p->!Character.isDigit(p));

        System.out.println(digits);

        ArrayList<Character> special=new ArrayList<>(list);

        special.removeAll(letters);
        special.removeAll(digits);

        System.out.println(special);














    }
}
