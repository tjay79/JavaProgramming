package week7Practice;

public class HowManyPalindromes {

    public static void main(String[] args) {

        String[] words={"anna", "level", "Java"};
        int palindromeCount=0;

        for (String each : words) {
            String reverse="";
            for(int i=each.length()-1;i>=0;i--){
                reverse+=each.charAt(i);
                if(each.equals(reverse)){
                    palindromeCount++;
                }
            }

        }
        System.out.println(palindromeCount);





    }
}
/*
write a program that can count how many palindromes in an array of
string
Ex:
{"anna", "level", "Java"};
output:
2
 */
