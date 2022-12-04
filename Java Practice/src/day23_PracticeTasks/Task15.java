package day23_PracticeTasks;

public class Task15 {

    public static void main(String[] args) {
calculator(3, 5, '-');



    }
    public static void calculator(double num1, double num2, char operator){

        double result=0;
        if(operator=='+'){
            result=num1+num2;
        }else if(operator=='-'){
            result=num1-num2;
        }else if(operator=='*'){
            result=num1*num2;
        }else{
            result=num1/num2;
        }
        System.out.println(result);


    }



}
/*
create a method named calculator that passes three arguments
(num1, num2, mathOperator), prints the calculation result
 */
