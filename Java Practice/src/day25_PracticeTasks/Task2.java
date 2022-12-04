package day25_PracticeTasks;

public class Task2 {

    public static void main(String[] args) {
        int[] a={2, 5, 100, 35};
        System.out.println(maxNumber(a));

    }
    public static int maxNumber (int[]a){
        int max=0;
        for (int each : a) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    public static double maxNumber (double[]a){
        double max=0;
        for (double each : a) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    public static long maxNumber (long[]a){
        long max=0l;
        for (long each : a) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    public static short maxNumber (short[]a){
        short max=0;
        for (short each : a) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    public static float maxNumber (float[]a){
        float max=0;
        for (float each : a) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    public static byte maxNumber (byte[]a){
        byte max=0;
        for (byte each : a) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }
}
/*
Task 2:
1. create a method that can return the max number from an integer
array
2. create a method that can return the max number from double array
3. create a method that can return the max number from long array
4. create a method that can return the max number from short array
5. create a method that can return the max number from float array
6. create a method that can return the max number from byte array
 */
