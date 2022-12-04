package utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtilities {

    public static void main(String[] args) {


    }

    //1. prints each element of an integer array in seperate lines
    public static void printEachElement(int[] array) {

        for (double each : array) {
            System.out.println(each);
        }

    }

    //2. print each element of a double array in seperate lines
    public static void printEachElement(double[] array) {

        for (double each : array) {
            System.out.println(each);
        }

    }

    //3. prints each element of a char array in seperate lines
    public static void printEachElement(char[] array) {

        for (char each : array) {
            System.out.println(each);
        }

    }

    //4. prints each element of a String array in seperate lines
    public static void printEachElement(String[] array) {

        for (String each : array) {
            System.out.println(each);
        }

    }

    //5. returns the maximum number for integer array
    public static int maxNumber(int[] array) {

        Arrays.sort(array);

        return array[array.length - 1];
    }

    //6. returns the maximum number for double array
    public static double maxNumber(double[] array) {

        Arrays.sort(array);

        return array[array.length - 1];
    }

    //7. returns the minimum number for integer array
    public static int minNumber(int[] array) {

        Arrays.sort(array);

        return array[0];
    }

    //8. returns the minimum number for double array
    public static double minNumber(double[] array) {

        Arrays.sort(array);

        return array[0];
    }

    //9. can check if the specified integer is contained in the array
    public static boolean isContained(int[] a, int a2) {

        boolean result = false;

        for (double each : a) {
            if (each == a2) {
                result = true;
                break;
            }

        }
        return result;

    }

    //10. can check if the specified double is contained in the array
    public static boolean isContained(double[] a, double a2) {

        boolean result = false;

        for (double each : a) {
            if (each == a2) {
                result = true;
                break;
            }

        }
        return result;

    }

    //11. can check if the specified char is contained in the array
    public static boolean isContained(char[] a, char a2) {

        boolean result = false;

        for (char each : a) {
            if (each == a2) {
                result = true;
                break;
            }

        }
        return result;

    }

    //12. can check if the specified String is contained in the array
    public static boolean isContained(String[] a, String a2) {

        boolean result = false;

        for (String each : a) {
            if (each.equals(a2)) {
                result = true;
                break;
            }

        }
        return result;

    }

    //13. create a return method called addInteger that can add an integer element after the last index of an array
    public static int[] addElement(int[] array, int element) {

        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    //14. create a return method called addDouble that can add a double element after the last index of an array
    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    //15. create a return method called addString that can add a String element after the last index of an array
    public static String[] addElement(String[] array, String element) {

        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    //16. create a return method called addChar that can add a char element after the last index of an array
    public static char[] addElement(char[] array, char element) {

        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    //17. this method can check the frequency of the given integer within the array
    public static int frequencyOfElement(int[] arr, int n1) {

        int frequency = 0;
        for (int each : arr) {

            if (each == n1) {
                frequency++;
            }


        }

        return frequency;
    }

    //18. this method can check the frequency of the given element within the array
    public static int frequencyOfElement(double[] arr, double n1) {

        int frequency = 0;
        for (double each : arr) {

            if (each == n1) {
                frequency++;
            }


        }

        return frequency;
    }

    //19. this method can check the frequency of the given char element within the array
    public static int frequencyOfElement(char[] arr, char n1) {

        int frequency = 0;
        for (char each : arr) {

            if (each == n1) {
                frequency++;
            }


        }

        return frequency;
    }

    //20. this method can check the frequency of the given String element within the array
    public static int frequencyOfElement(String[] arr, String n1) {

        int frequency = 0;
        for (String each : arr) {

            if (each.equals(n1)) {
                frequency++;
            }


        }

        return frequency;
    }

    //21. this method find the unique elements from an integer array
    public static int[] uniqueElements(int[] arr) {

        int[] result = {};
        for (int each : arr) {
            if (ArraysUtilities.frequencyOfElement(arr, each) == 1) {//if the frequency is one it is a unique element
                result = ArraysUtilities.addElement(result, each);
            }
        }
        return result;
    }

    //22. this method finds the unique elements from a double array and creates a new double array with the unique elements
    public static double[] uniqueElements(double[] arr) {

        double[] result = {};
        for (double each : arr) {
            if (ArraysUtilities.frequencyOfElement(arr, each) == 1) {//if the frequency is one it is a unique element
                result = ArraysUtilities.addElement(result, each);
            }
        }
        return result;
    }

    //23. this method finds the unique elements from a char array and creates a new char array with the unique elements
    public static char[] uniqueElements(char[] arr) {

        char[] result = {};
        for (char each : arr) {
            if (ArraysUtilities.frequencyOfElement(arr, each) == 1) {//if the frequency is one it is a unique element
                result = ArraysUtilities.addElement(result, each);
            }
        }
        return result;
    }

    //24. this method finds the unique elements from a String array and creates a new String array with the unique elements
    public static String[] uniqueElements(String[] arr) {

        String[] result = {};
        for (String each : arr) {
            if (ArraysUtilities.frequencyOfElement(arr, each) == 1) {//if the frequency is one it is a unique element
                result = ArraysUtilities.addElement(result, each);
            }
        }
        return result;
    }

    //25. this method removes a given element from the int array
    public static int[] removeElement(int[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("invalid index" + index);
            System.exit(0);
        }
        int[] result = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {//if the index of array is matching with the given index
                continue;//skip
            }
            result[j++] = arr[i];
        }
        return result;
    }

    //26. this method removes a given element index from the double array
    public static double[] removeElement(double[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("invalid index" + index);
            System.exit(0);
        }
        double[] result = new double[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {//if the index of array is matching with the given index
                continue;//skip
            }
            result[j++] = arr[i];
        }
        return result;
    }

    //27. this method removes the element at a given index from a char array
    public static char[] removeElement(char[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("invalid index" + index);
            System.exit(0);
        }
        char[] result = new char[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {//if the index of array is matching with the given index
                continue;//skip
            }
            result[j++] = arr[i];
        }
        return result;
    }

    //28. this method removes the element at a given index from a String array
    public static String[] removeElement(String[] arr, int index) {

        if (index < 0 || index > arr.length - 1) {
            System.err.println("invalid index" + index);
            System.exit(0);
        }
        String[] result = new String[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {//if the index of array is matching with the given index
                continue;//skip
            }
            result[j++] = arr[i];
        }
        return result;
    }

    //29. this method merges two int arrays
    public static int[] merged(int[] arr1, int[] arr2) {

        int[] merged = {};


        for (int each : arr1) {
            merged = addElement(merged, each);
        }
        for (int each : arr2) {
            merged = addElement(merged, each);
        }

        return merged;


    }

    //30. this method merges two double arrays
    public static double[] merged(double[] arr1, double[] arr2) {

        double[] merged = {};


        for (double each : arr1) {
            merged = addElement(merged, each);
        }
        for (double each : arr2) {
            merged = addElement(merged, each);
        }

        return merged;


    }

    //31. this method merges two char arrays
    public static char[] merged(char[] arr1, char[] arr2) {

        char[] merged = {};


        for (char each : arr1) {
            merged = addElement(merged, each);
        }
        for (char each : arr2) {
            merged = addElement(merged, each);
        }

        return merged;


    }

    //32. this method merges two String arrays
    public static String[] merged(String[] arr1, String[] arr2) {

        String[] merged = {};


        for (String each : arr1) {
            merged = addElement(merged, each);
        }
        for (String each : arr2) {
            merged = addElement(merged, each);
        }

        return merged;


    }

    //33. this method can reverse the order of an int array
    public static int[] reversed(int[] arr) {

        int[] reversed = new int[arr.length];


        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = arr[i];

        }
        return reversed;
    }

    //34. this method can reverse the order of a double array
    public static double[] reversed(double[] arr) {

        double[] reversed = new double[arr.length];


        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = arr[i];

        }
        return reversed;
    }

    //35. this method can reverse the order of a char array
    public static char[] reversed(char[] arr) {

        char[] reversed = new char[arr.length];


        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = arr[i];

        }
        return reversed;
    }

    //36. this method can reverse the order of a String array
    public static String[] reversed(String[] arr) {

        String[] reversed = new String[arr.length];


        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = arr[i];

        }
        return reversed;
    }

    //37. this method can replace a given element in an integer array at the given index
    public static int[] replaceElement(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //38. this method can replace a given element in a double array at the given index
    public static double[] replaceElement(double[] array, int index, double newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //39. this method can replace a given element in a char array at the given index
    public static char[] replaceElement(char[] array, int index, char newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //40. this method can replace a given element in a String array at the given index
    public static String[] replaceElement(String[] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //41. this method replaces all the matching old int elements with the new int element
    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }

        }
        return array;
    }

    //42. this method replaces all the matching old double elements with the new double element
    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }

        }
        return array;
    }

    //43. this method replaces all the matching old char elements with the new char element
    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }

        }
        return array;
    }

    //44. this method replaces all the matching old String elements with the new String element
    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldElement)) {
                array[i] = newElement;
            }

        }
        return array;
    }

    //45. this method removes duplicates from an integer array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (!ArraysUtilities.isContained(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;
    }

    //46. this method removes duplicates from a double array
    public static double[] removeDuplicates(double[] array) {
        double[] result = {};

        for (double each : array) {
            if (!ArraysUtilities.isContained(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;
    }


    //47. this method removes duplicates from a char array
    public static char[] removeDuplicates(char[] array) {
        char[] result = {};

        for (char each : array) {
            if (!ArraysUtilities.isContained(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;
    }

    //48, this method removes duplicates from a String array
    public static String[] removeDuplicates(String[] array) {
        String[] result = {};

        for (String each : array) {
            if (!ArraysUtilities.isContained(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;
    }

    //49. this method inserts a given int at a given index in an array
    public static int[] insert(int[] array, int index, int number) {
        int[] array2 = new int[array.length + 1];

        int indexofArray = 0;

        for (int each : array) {

            array2[indexofArray] = array[indexofArray];
            if (indexofArray == 2) {
                break;
            }
            indexofArray++;


        }
        for (int i = 2; i < array.length; i++) {
            array2[i + 1] = array[i];
        }
        array2[index] = number;

        return array2;
    }

    //50. this method inserts a given double at a given index in a double array
    public static double[] insert(double[] array, int index, double number) {
        double[] array2 = new double[array.length + 1];

        int indexofArray = 0;

        for (double each : array) {

            array2[indexofArray] = array[indexofArray];
            if (indexofArray == 2) {
                break;
            }
            indexofArray++;


        }
        for (int i = 2; i < array.length; i++) {
            array2[i + 1] = array[i];
        }
        array2[index] = number;

        return array2;
    }


    //51. this method inserts a given char at a given index in a char array
    public static char[] insert(char[] array, int index, char number) {
        char[] array2 = new char[array.length + 1];

        int indexofArray = 0;

        for (int each : array) {

            array2[indexofArray] = array[indexofArray];
            if (indexofArray == 2) {
                break;
            }
            indexofArray++;


        }
        for (int i = 2; i < array.length; i++) {
            array2[i + 1] = array[i];
        }
        array2[index] = number;

        return array2;
    }

    //52. this method inserts a given String at a given index in a String array
    public static String[] insert(String[] array, int index, String number) {
        String[] array2 = new String[array.length + 1];

        int indexofArray = 0;

        for (String each : array) {

            array2[indexofArray] = array[indexofArray];
            if (indexofArray == 2) {
                break;
            }
            indexofArray++;


        }
        for (int i = 2; i < array.length; i++) {
            array2[i + 1] = array[i];
        }
        array2[index] = number;

        return array2;
    }

    //53. this method swaps the integers at the two given indexes with each other
    public static int[] swap(int[] array, int index1, int index2) {


    int[] swapped = new int[array.length];

        for(int i = 0; i<array.length;i++) {

        swapped[i] = array[i];
        if (i == index1) {
            swapped[i] = array[index2];
        }
        if (i == index2) {
            swapped[i] = array[index1];
        }

    }
        return swapped;
}

    //54. this method swaps the double at the two given indexes with each other
    public static double[] swap(double[] array, int index1, int index2) {


        double[] swapped = new double[array.length];

        for(int i = 0; i<array.length;i++) {

            swapped[i] = array[i];
            if (i == index1) {
                swapped[i] = array[index2];
            }
            if (i == index2) {
                swapped[i] = array[index1];
            }

        }
        return swapped;
    }

    //55. this method swaps the chars at the two given indexes with each other
    public static char[] swap(char[] array, int index1, int index2) {


        char[] swapped = new char[array.length];

        for(int i = 0; i<array.length;i++) {

            swapped[i] = array[i];
            if (i == index1) {
                swapped[i] = array[index2];
            }
            if (i == index2) {
                swapped[i] = array[index1];
            }

        }
        return swapped;
    }

    //56. this method swaps the String at the two given indexs with each other
    public static String[] swap(String[] array, int index1, int index2) {


        String[] swapped = new String[array.length];

        for(int i = 0; i<array.length;i++) {

            swapped[i] = array[i];
            if (i == index1) {
                swapped[i] = array[index2];
            }
            if (i == index2) {
                swapped[i] = array[index1];
            }

        }
        return swapped;
    }

    //57. converts an array of values to an arraylist
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){

        ArrayList<Integer> lists = new ArrayList<>();

        for (int each : array) {
            lists.add(each);
        }
        return lists;


    }




}
