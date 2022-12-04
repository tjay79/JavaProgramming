package day27_WrapperClasses;

public class Replace {

    public static void main(String[] args) {


    }


    public static int[] replaceElement(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
}