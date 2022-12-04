package day09_IfStatements;

public class MaxNumber {

    public static void main(String[] args) {

        int n1 = 30,
            n2 = 40;

        boolean max1 = n1 > n2;
        boolean max2 = ! max1;

        if(max1){
            System.out.println(n1 + " is the maximum number");
        }else{
            System.out.println(n2 + " is the maximum number");
        }






    }
}
