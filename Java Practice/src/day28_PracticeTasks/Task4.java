package day28_PracticeTasks;

import java.util.ArrayList;

public class Task4 {

    public static void main(String[] args) {

        String[] arr1={"A","B","C"};
        String[] arr2={"D","E","F","G"};
        ArrayList<String> merge = new ArrayList<>();

        for (String each : arr1) {
            merge.add(each);
        }
        for (String s : arr2) {
            merge.add(s);
        }

        System.out.println(merge);







    }
}
/*
write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E",
"F", "G"}
 */
