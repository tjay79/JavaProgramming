package week6Practice;

public class EqualFrequency {

    public static void main(String[] args) {

        String sentence="caT dog doG cAt CAT";
        sentence=sentence.toLowerCase();

        int frequencyDog= 0;
        int frequencyCat=0;

        while(sentence.contains("dog")||sentence.contains("cat")){

            if(sentence.contains("dog")){

                sentence=sentence.replaceFirst("dog","");
                frequencyDog++;
            }else{
                sentence=sentence.replaceFirst("cat","");
                frequencyCat++;
            }

        }
        System.out.println(frequencyDog);
        System.out.println(frequencyCat);




    }
}
/*
write a program to print true if the string "cat" and "dog" appear the
same number of times in the given sentence
        Ex:
            sentence = "caT dog dogG cAt"
            output:
                true
 */
