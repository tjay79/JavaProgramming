package week7Practice;

public class EvenAndOddCount {

    public static void main(String[] args) {

        int[] numbers={9, 4, 6, 11, 3, 5};
        int evenCount=0;
        int oddCount=0;

        for (int number : numbers) {
            if(number%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even numbers: "+evenCount+"\nOdd numbers: "+oddCount);

    }
}
/*
Write a program that can count the even and odd number from an
array of integers
Note: MUST use for each loop
 */
