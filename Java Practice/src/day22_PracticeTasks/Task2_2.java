package day22_PracticeTasks;

import java.util.Arrays;

public class Task2_2 {

    public static void main(String[] args) {

        String[][] items={{"Apple", "Banana", "Grape", "Avocado"},{"Paper Towels", "Toilet Paper", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        String reverse="";

        for (String[] item : items) {
            for (int i = item.length - 1; i >= 0; i--) {
                reverse+=item[i]+"\t";
            }
        }
        System.out.print(reverse);






    }
}
