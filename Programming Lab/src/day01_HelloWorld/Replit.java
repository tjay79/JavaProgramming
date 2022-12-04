package day01_HelloWorld;
import java.util.Scanner;
public class Replit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){

        String result="";
        for(int i=0; i<str.length();i++){
            char each=str.charAt(i);
            int count=0;
            for(int j=0; j<str.length();j++){
                char ch=str.charAt(j);
                if(ch==each){
                    count++;
                }
            }
            if(result.contains(""+each)){
                continue;
            }

            result+=count;
            result+=each;

        }

        return result;
    }
}
