package day28_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers2.add(numbers.get(numbers.size()-1));
        numbers2.add(numbers.get(1));
        numbers2.add(numbers.get(2));
        numbers2.add(numbers.get(3));
        numbers2.add(numbers.get(0));

        System.out.println(numbers2);




    }
}
/*
write a program that can swap the first and last elements of an
integer arraylist
            ex:
                list = [1,2,3,4,5];
                output: [5,2,3,4,1];
 */
