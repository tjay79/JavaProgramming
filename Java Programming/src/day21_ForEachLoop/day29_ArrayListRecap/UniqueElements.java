package day21_ForEachLoop.day29_ArrayListRecap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> list2 = new ArrayList<>();

        for (Integer each : list) {
            int frequency= Collections.frequency(list, each);
            if(frequency==1){
                list2.add(each);
            }
        }
        System.out.println(list2);

        System.out.println("__________________________________");

        ArrayList<Integer> unique = new ArrayList<>(list);

        unique.removeIf(p->Collections.frequency(unique, p)>1);

        System.out.println(unique);


    }
}
