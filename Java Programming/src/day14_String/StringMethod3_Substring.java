package day14_String;

public class StringMethod3_Substring {

    public static void main(String[] args) {
        //substring (beginning index, ending index)
        String word1 = "Cydeo School";
        String brand = word1.substring(0,5);
        System.out.println("brand = " + brand);

        String str1 = word1.substring(6);
        System.out.println("str1 = " + str1);

        String word2 = "Java Programming Language";

        String s1=word2.substring(0,word2.indexOf(" "));
        String s2=word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
        String s3=word2.substring(word2.lastIndexOf(" ")+1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


    }
}
