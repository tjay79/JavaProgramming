package day28_ArrayList;

import java.util.ArrayList;

public class ArraysListMethods1 {

    public static void main(String[] args) {

        ArrayList <Integer> numbers =new ArrayList<>();

        numbers.add(10);//add() adds an element to the ArrayList
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(2, 25);//add() can also insert an element at a given index if you also specify the index
        numbers.add(5, 45);

        System.out.println(numbers);

        System.out.println("_________________________________");

        System.out.println(numbers.size());//size() gets you the length of the ArrayList

        int lastIndex= numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex);

        System.out.println("_____________________________________");

        int n= numbers.get(3);//you can get the element at the specified index... you can assign it to the primitve type or
        //to the Wrapper Class

        System.out.println(n);

        System.out.println("______________________________________");

        for(int i=0; i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        System.out.println("________________________________________");

        ArrayList <String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("Ruby");
        list.add("C#");

        list.set(2, "Javascript");//replaces the element at the given index with the new element
        list.set(4, "C++");

        System.out.println(list);

        System.out.println("__________________________________");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(1);// remove(index) removes the element at the given index

        System.out.println(employees);

       boolean r1= employees.remove("Neira");// remove(object/non-primitive) removes the element that is specified,
        // returns a boolean result

        System.out.println(employees);
        System.out.println(r1);

        list.clear();// empties the ArrayList

        System.out.println(list.size());




    }
}
