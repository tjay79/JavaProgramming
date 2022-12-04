package week10_11_12_2022;


public class MethodOverloadingIntro {

    public static void main(String[] args) {

        //I want to add 2 numbers

        int i=23;
        double d=24.5;
        float f=23.5f;//or (float)23.5;







    }
    //we can use the method overloading if we have different parameters, different number of parameters, or if we change
    // the order of the parameters

    public static void sum(int i, double d) {
    }

    public static int sum(double d, int i){//we can also overload by changing the order of the parameters
        return 0;
    }

}
