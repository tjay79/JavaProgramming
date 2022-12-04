package day21_ForEachLoop.day29_ArrayListRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilities {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));

        Collections.sort(list);//sort method for collections

        System.out.println(list);

        System.out.println("___________________________");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));

        System.out.println(list2);
        Collections.reverse(list2);//reverses the order of a collection
        System.out.println(list2);

        System.out.println("_______________________________________");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        Collections.swap(list3,1, 4);//swaps the elements of the collection 1 and 4 are the indexes of the
        // elements that should be swapped

        System.out.println(list3);

        System.out.println("_____________________________");

      int max=  Collections.max(list3);
      int min= Collections.min(list3);

        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
