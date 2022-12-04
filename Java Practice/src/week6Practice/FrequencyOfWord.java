package week6Practice;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence= "Java Java Java";
        sentence= sentence.toLowerCase();
        int frequency=0;



            while(sentence.contains("java")){
                sentence=sentence.replaceFirst("java","");
                frequency=frequency+1;


            }

        System.out.println(frequency);

    }
}
/*
write a program that can return the frequency of the a word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
Hint: you need to create
 */
