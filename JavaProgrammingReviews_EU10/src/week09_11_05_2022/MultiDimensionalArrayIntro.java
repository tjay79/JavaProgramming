package week09_11_05_2022;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {


        int [] firstArray={1, 2, 3};
        int[] secondArray={4, 5, 6};
        int[] thirdArray={7, 8, 9, 10};

        int[][] twoDimensionalArray={
                {1, 2, 3},//first Array
                {4, 5, 6},//second Array
                {7, 8, 9, 10}//third Array
        };

        int [][] array2D={firstArray,secondArray,thirdArray};//we can also create it like this

        System.out.println(twoDimensionalArray[0][1]);// in order to reach and print 2 first we need to go to the
        // first array by using
        //index of array which is 0 then I need to go to that element by using index of the element which is 1

        for (int i=0; i< twoDimensionalArray.length;i++){//in order to go to array one by one


            for (int j=0;j< twoDimensionalArray[i].length;j++){//this is for finding the element inside inner array
                System.out.println(twoDimensionalArray[i][j]);

            }

        }





    }
}
