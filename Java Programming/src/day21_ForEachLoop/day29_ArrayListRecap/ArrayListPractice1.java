package day21_ForEachLoop.day29_ArrayListRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String[] countries={"Japan","Korea","United States","Turkey","United Kingdom","Canada"};

        ArrayList<String> countriesList= new ArrayList<>(Arrays.asList(countries));

            countriesList.removeIf(each->each.length()>=10);

        countries=countriesList.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));










    }
}
