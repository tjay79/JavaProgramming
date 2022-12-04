package day14_String;

public class Substring {

    public static void main(String[] args) {

        String str1="Java is fun, Java is cool";

        String s1= str1.substring(0,10+1);
        System.out.println("s1 = " + s1);

        String s2= str1.substring(str1.lastIndexOf("J"));
        System.out.println("s2 = " + s2);


    }
}
