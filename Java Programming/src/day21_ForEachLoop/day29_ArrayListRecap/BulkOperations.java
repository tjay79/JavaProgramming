package day21_ForEachLoop.day29_ArrayListRecap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));//asList method accepts an array of values and converts it to a
        // collection of values

        System.out.println(list);

        System.out.println("________________________________________________");

        list.removeAll(Arrays.asList(3, 5, 8));//removes all the given values at the same time, if there are
        // multiple values it removes them all

        System.out.println(list);

        System.out.println("______________________");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900));

        System.out.println(list2);

        list2.retainAll(Arrays.asList(100, 200, 300));//keeps only the given values, all other values will be deleted

        System.out.println(list2);

        list.retainAll(Arrays.asList());

        System.out.println("___________________________________");

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(jobTitles);

        System.out.println("______________________________");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 8, 9, 10));

        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r3 = nums.containsAll(Arrays.asList(2, 5, 10));//checks if the arraylist contains the given
        // values, returns boolean
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("_______________________________");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));//allows me to convert an Array
        // directly to arraylist, only works with non primitives

        System.out.println(namesList);


    }
}