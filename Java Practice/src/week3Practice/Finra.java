package week3Practice;

public class Finra {

    public static void main(String[] args) {

        int number = 5;
        boolean fin = number%3==0;
        boolean ra = number%5==0;


        if(fin&&ra){
            System.out.println("FINRA");
        }else if (fin){
            System.out.println("FIN");
        }else if(ra){
            System.out.println("RA");
        }else{
            System.out.println("Void");
        }






    }
}
/*
Create a class called FINRA, Write a function which prints out the
number. but for number which is a multiple of 3, print "FIN" instead
of the number and for number which is a multiple of 5, print "RA"
instead of the number. and for number which is a multiple of both 3
and 5, print "FINRA" instead of the number.
ex:
number = 3
output:
FIN
number = 10
output:
RA
number = 15
output:
FINRA
 */