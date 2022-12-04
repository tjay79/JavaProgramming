package day08_IfStatement;

public class MinNumber {

    public static void main(String[] args) {

        int n1 = 50,
        n2 = 50;

        boolean min1 = n1 < n2;
        boolean min2 = n1 > n2;
        boolean equal = n1 == n2;

        if(min1){
            System.out.println(n1 + " is the minimum number");
        }

        if(min2){
            System.out.println(n2 + " is the minimum number");
        }

        if(equal){
            System.out.println(n1 + " is equal to " + n2);
        }




    }
}
