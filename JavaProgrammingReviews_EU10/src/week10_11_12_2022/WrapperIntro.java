package week10_11_12_2022;

public class WrapperIntro {

    public static void main(String[] args) {


        String str="(((W&e**_lco73me %T%o Co!@$,,<r<e <J>>>&@av^453a";
        getSentence(str);





    }
    public static void getSentence(String str){
        String temp="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           /* if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
                temp+=ch;
            }
            */

            //if we are talking english letters we can use isAlphabetic()
            //if we are talking other letters we can use isLetter()

            if(Character.isUpperCase(ch)){
                temp+=' ';
            }
            if(Character.isLetter(ch)){
                temp+=ch;
            }
        }
        System.out.println(temp.trim());
    }
}
