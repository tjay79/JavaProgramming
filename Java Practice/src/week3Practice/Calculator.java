package week3Practice;

public class Calculator {

    public static void main(String[] args) {

        int n1 = 8;
        int n2 = 2;

        char mathOperator = '/';


        boolean add = mathOperator=='+';
        boolean minus = mathOperator=='-';
        boolean mul = mathOperator=='*';
        boolean div = mathOperator=='/';

        if(add){
            int addition = n1+n2;
            System.out.println(addition);
        }else if(minus){
            int sub = n1-n2;
            System.out.println(sub);
        }else if(mul){
            int times = n1*n2;
            System.out.println(times);
        }else if(div){
            int div2 = n1/n2;
            System.out.println(div2);
        }else{
            System.out.println("Invalid operator");
        }

    }
}
/*
Create a class called Calculator, Given two double variables named n1
& n2, and a char variable named mathOperator, write a program that can
calculate result of n1&n2 based on the given math Operator.
char operator -> -, +, *, /
when operator is + : add num1, num2
when operator: - : minus num1, num2
when operator: * : multiply num1, num2
when operator: / : divide num1, num2
for any other operators: print "invalid operator"
Ex:
n1 = 10, n2= 20, mathOperator = '+'
output:
30
 */