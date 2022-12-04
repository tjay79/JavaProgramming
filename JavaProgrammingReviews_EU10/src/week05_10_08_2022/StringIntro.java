package week05_10_08_2022;

public class StringIntro {

    public static void main(String[] args) {

        //we can create String in two different ways
        //1. String literal
        String str ="Kazim";// we store this value in the String pool
        String str1="Kazim";//there is no new object created in the String pool

        System.out.println(str==str1);

        //2.new keyword

        String str2= new String("Kazim");
        String str3=new String("Kazim");

        System.out.println(str1==str2);


    }
}
