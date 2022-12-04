package day21_ForEachLoop;
import java.util.Arrays;
public class Anagram {

    public static void main(String[] args) {

        String str1="acdb";
        String str2="dbca";

        char[] stra=str1.toCharArray();
        char[] strb=str2.toCharArray();

        Arrays.sort(stra);
        Arrays.sort(strb);

        boolean same= Arrays.equals(stra, strb);
        System.out.println(same);








    }
}
