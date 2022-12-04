package day21_ForEachLoop.day29_ArrayListRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int[] array={1, 2, 3, 4, 5, 6};

        int[] array2=new int[array.length];


        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {

            array2[j]=array[i];
        }

        System.out.println(Arrays.toString(array2));

        System.out.println("_________________________________");

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        ArrayList<Integer> list2=new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            int each=list.get(i);
            list2.add(each);
        }
        System.out.println(list2);



    }
}
