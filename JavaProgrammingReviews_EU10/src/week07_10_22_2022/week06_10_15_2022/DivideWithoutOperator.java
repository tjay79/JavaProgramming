package week07_10_22_2022.week06_10_15_2022;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        int num1 =30;
        int num2=7;
        int count=0;

        while(num1>=num2){

            num1-=num2;
            count++;

        }
        System.out.println(count+" with the remainder of "+num1);

    }
}
