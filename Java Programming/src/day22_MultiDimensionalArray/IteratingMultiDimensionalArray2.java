package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][] arr2D= {{1, 2, 3},{4, 5, 6, 7},{8, 9, 10, 11, 1, 13}};

        for (int i = arr2D.length - 1; i >= 0; i--) {  //i: index number of 1 ´D array starting from last index of 0

            for (int j = 0; j < arr2D[i].length; j++) {  //j: index number of elements starting from 0
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }





    }
}
