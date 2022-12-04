package day28_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7));

        int temp=0;

        for (int i=0;i< numbers.size();i++) {
            if(numbers.get(i)== numbers.get(i+1)){
                temp= numbers.get(i);
                break;
            }
        }
        System.out.println(temp);




    }
}
/*
Write a program that can return the first duplicated element from an
arrayList of Integer
Ex:
list = [1,2,2,3,4,4,5,6,7,7];
output:
2
 */
