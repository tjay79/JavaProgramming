package day14_String;

public class StringMethod2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");
        System.out.println("str2 = " + str2);

        String email="JohnSmith@yahoo.com";
        email=email.replace("yahoo" , "gmail");
        System.out.println("email = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", "");
        sentence2 = sentence2.replace("  ","");
        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog";
        s=s.replace("Dog","Cat");
        System.out.println("s = " + s);


    }
}
