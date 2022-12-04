package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str="123";

        int n1=Integer.parseInt(str);//parse Method

        System.out.println(n1+1);
        System.out.println(str+1);

        String str2="10.5";

        double n2=Double.parseDouble(str2);
        System.out.println(n2+1);

        System.out.println("-------------------------------");

        int max=Integer.MAX_VALUE;//able to get the max value of an int, this can be used for all primitive data types
        int min=Integer.MIN_VALUE;//able to get the min value of an int, this can be used for all primitive data types

        System.out.println(max);
        System.out.println(min);

        String s1="trues";
        boolean r1=Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("---------------------------------");

        String s2="123";

        Integer i1=Integer.valueOf(s2);

        int y=Integer.valueOf(s2);//valueOf Method can convert directly to wrapper class

        System.out.println(i1);
        System.out.println(y);

        System.out.println("----------------------------------");

        //isDigit()
        //isLetter()
        //isLetterOrDigit()
        //isUpperCase()
        //isLowerCase()

        char ch1='0';
        boolean c1=Character.isDigit(ch1);
        System.out.println(c1);

        char ch2='l';
        boolean c2=Character.isLetter(ch2);
        System.out.println(c2);

        char ch3='@';
        boolean c3=!Character.isLetterOrDigit(ch3);
        System.out.println(c3);

        System.out.println("----------------");

        String s="a1b2cde2efg3hi4";

        int sum=0;

        for (char each : s.toCharArray()) {

            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }

        }
        System.out.println(sum);

    }
}
