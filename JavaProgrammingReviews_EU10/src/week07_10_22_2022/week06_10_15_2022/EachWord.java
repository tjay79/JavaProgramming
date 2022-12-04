package week07_10_22_2022.week06_10_15_2022;

public class EachWord {

    public static void main(String[] args) {

        String sentence= "Java is java in everywhere is java";
        String word="";
        for (int i =0; i<=sentence.length()-1;i++){
           if(sentence.charAt(i)!=' '){
               word+=sentence.charAt(i);
           }
           if(sentence.charAt(i)==' '){
               System.out.println(word);
               word="";
           }

        }
        System.out.println(word);




    }
}
