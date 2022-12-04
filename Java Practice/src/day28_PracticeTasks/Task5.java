package day28_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        int max=0;

        numbers.addAll(Arrays.asList(1, 2, 3, 4 ,5));

        for (Integer number : numbers) {
            if(number>max){
                max=number;
            }
        }
        System.out.println(max);



    }
}
/*
Write a program that can find the maximum number from an ArrayList of
integers
Ex:
list = [1,2,3,4,5];
output:
5
 */
