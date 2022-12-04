package day22_PracticeTasks;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
//                         0         1
        int[][] array={{1, 2, 3},{4, 5, 6}};
//                      0  1  2   0  1  2
        int[][] reverse=new int[array.length][];

        for (int i = array.length - 1,k = 0; i >= 0; i--,k++) {

            reverse[k] = new int[array[i].length];

            for (int j = array[i].length - 1,l = 0; j >= 0; j--,l++) {

                reverse[k][l] = array[i][j];

            }

        }

        System.out.println(Arrays.deepToString(reverse));


    }
}
