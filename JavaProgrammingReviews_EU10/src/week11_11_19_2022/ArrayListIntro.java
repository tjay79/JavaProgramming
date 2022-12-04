package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

    public static void main(String[] args) {

        //how to create an ArrayList

        ArrayList<String> cities=new ArrayList<>();

        cities.add("London");//returns boolean
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Rome");
        cities.add(0, "Vienna");

        //for Arrays, Arrays.toString(Array name)
        System.out.println(cities);

        //how to get an element by index number
        System.out.println(cities.get(0));

        //how to update your element
        cities.set(2, "New York");

        System.out.println("===========After Update==========");

        System.out.println(cities);

        System.out.println(cities.indexOf("New York"));//if it doesn´t exist will return -1

        //bulk operations

        //addAll

        ArrayList<String> names=new ArrayList<>();

        names.addAll(Arrays.asList("Mesut","Osman","Seyma"));


        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(1, 1, 1, 2, 3, 4, 5, 1, 1));

        numbers.removeIf(p->p<3);//we can´t use the remove method in a loop because at every iteration the index number is changing

        System.out.println(numbers);


    }
}
