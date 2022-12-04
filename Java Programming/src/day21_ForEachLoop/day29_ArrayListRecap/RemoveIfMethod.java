package day21_ForEachLoop.day29_ArrayListRecap;

import utilities.StringUtilities;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println(list);

        list.removeIf( p -> p < 5);//lambda expression

        System.out.println(list);

        System.out.println("_____________________________");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        list2.removeIf(each -> each%2==0);//p is the variable name that represents each value of the list

        System.out.println(list2);

        System.out.println("_____________________________");

        ArrayList<String> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList("Java","Python","Javascript","C#","C++","Java","Java"));
        list3.removeIf(each->each.startsWith("J"));

        System.out.println(list3);


        System.out.println("______________________________________");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Java","Python","Cydeo"));

        names.removeIf(name-> !StringUtilities.isPalidrome(name));

        System.out.println(names);




    }
}
