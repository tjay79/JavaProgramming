package day01_JavaIntro;
import utilities.ArraysUtilities;
import utilities.StringUtilities;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String str="Wooden Spoon";

        StringUtilities.printEachChar(str);

       String[] arr={"Java","Java","Python","Python","Python"};
       arr=ArraysUtilities.removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

    }
}
