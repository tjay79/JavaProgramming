package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        int[] intArray={5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);

        double[] doubleArray={10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray={'E','F','B','D','C','A'};
        Arrays.sort(charArray);

    }
    public static int sum(int n1, int n2){
        int result=n1+n2;
        return result;
    }
    public static int sum(int n1, int n2, int n3){
        int result=n1+n2+n3;
        return result;
    }
    public static int sum(int n1, int n2, int n3, int n4){
        int result= n1+n2+n3+n4;
        return result;
    }
}
/*
You can use Method Overloading, if the parameters are different data type or different amount of parameters
 */
