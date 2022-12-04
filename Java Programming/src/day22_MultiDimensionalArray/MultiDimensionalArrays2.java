package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays2 {

    public static void main(String[] args) {

        int[] arr1={1, 2, 3};
        int[] arr2={4, 5, 6};
        int[] arr3={7, 8, 9};
//                            0          1        2            0           1            2
      int[][][] arr3D= { {{1, 2, 3},{4, 5, 6},{7, 8, 9}},{{10, 20, 30},{40, 50, 60},{70, 80, 90}}};
//                                      0                                    1

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.toString(arr3D[1][1]));


        for (int[][] each : arr3D) {
            for (int[] each2D : each) {
                for (int each3d : each2D) {
                    System.out.print(each3d+" ");
                }
                System.out.println();
            }

        }



    }
}
