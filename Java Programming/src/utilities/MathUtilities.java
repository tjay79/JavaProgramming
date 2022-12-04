package utilities;

public class MathUtilities {

    public static void main(String[] args) {

    }
    //returns the sum of two integers
    public static int sum (int n1, int n2){
        int sum=n1+n2;
        return sum;

    }

    //returns the sum of two doubles
    public static double sum (double n1, double n2){

        double sum=n1+n2;
        return sum;
    }

    //returns the subtraction of two integers
    public static int subtraction (int n1, int n2){

        int subtraction=n1-n2;
        return subtraction;
    }

    //returns the subtraction of two doubles
    public static double subtraction (double n1, double n2){

        double subtraction = n1-n2;
        return subtraction;
    }

    //returns the product of two integers
    public static int multiply (int n1, int n2){

        int multiplication=n1*n2;
        return multiplication;
    }

    //returns the product of two doubles
    public static double multiply (double n1, double n2){

        double multiply=n1*n2;
        return multiply;
    }

    //returns the dividend of two doubles
    public static double divide (double n1, double n2){

        double dividend=n1/n2;
        return dividend;
    }

    //can check if an integer is even
    public static boolean isEven (int n1){
        boolean isEven=n1%2==0;
        return isEven;

    }

    //can check if an integer is odd
    public static boolean isOdd (int n1){

        boolean isOdd=n1%2==1;
        return isOdd;
    }

    //can return the maximum number between two integers
    public static int max (int n1, int n2){
        int max=0;
        if(n1>n2){
            max=n1;
        }else{
            max=n2;
        }
        return max;
    }

    //can return the maximum number between two doubles
    public static double max (double n1, double n2){
        double max=0;
        if(n1>n2){
            max=n1;
        }else{
            max=n2;
        }
        return max;
    }

    //can return the minimum number between two integers
    public static int min (int n1, int n2){
        int min=0;
        if(n1>n2){
            min=n2;
        }else{
            min=n1;
        }
        return min;
    }

    //can return the minimum number between two doubles
    public static double min (double n1, double n2){
        double min=0;
        if(n1>n2){
            min=n2;
        }else{
            min=n1;
        }
        return min;
    }

    //can return the square of an integer
    public static int square (int n1){

        int square=n1*n1;

        return square;
    }

    //can return the square of a double
    public static double square (double n1){

        double square=n1*n1;

        return square;
    }

    //can return the cube of an integer
    public static int cube (int n1){

        int cube=n1*n1*n1;

        return cube;
    }

    //can return the cube of a double
    public static double cube (double n1){

        double cube=n1*n1*n1;

        return cube;
    }




}
