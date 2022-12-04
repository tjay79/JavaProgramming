package day28_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        int min=100;

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5 ));

        for (Integer number : numbers) {
            if(number<min){
                min=number;
            }
        }

        System.out.println(min);




    }
}
/*
Write a program that can find the minimum number from an ArrayList of
integers
Ex:
list = [1,2,3,4,5];
output:
1
 */
