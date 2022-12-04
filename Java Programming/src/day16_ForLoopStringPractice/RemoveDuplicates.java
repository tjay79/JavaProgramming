package day16_ForLoopStringPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String word="aabbaacc";
        String result="";

        for(int i=0; i<=word.length()-1;i++){
            String ch= ""+word.charAt(i);
            if(!result.contains(ch)){
                result+=ch;
            }

        }
        System.out.println(result);

    }
}
