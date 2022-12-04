package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

        int n1 = 30,
            n2 = 25;

        boolean min1 = n1 < n2;
        boolean min2 = !min1;

        if(min1){
            System.out.println(n1 + " is the minimum number");
        }else{
            System.out.println(n2 + " is the minimum number");
        }





    }
}
