package day28_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1, 2, 3, 4 ,5));

        int index=0;
        for (Integer each : numbers) {

            if(each%2==1){
                numbers.set(index,each*2);
            }
            index++;
        }

        System.out.println(numbers);





    }
}
/*
write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
 */
