package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String[] students={"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};

        String[] earlyBirds= Arrays.copyOf(students, 5);

        System.out.println(Arrays.toString(earlyBirds));





    }
}
