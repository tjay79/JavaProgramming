package day24_PracticeTasks;

public class frequencyOfWord {

    public static void main(String[] args) {

        int result=frequencyOfWord("Java java java python python","java");

        System.out.println(result);

    }

    public static int frequencyOfWord(String sentence, String word){
        int count=0;
        String[] words=sentence.split(" ");
        for (String s : words) {
            if(s.equalsIgnoreCase(word)){
                count++;
            }
        }

        return count;

    }
}
/*
create a method named frequencyOfWord that passes two
parameters: string sentence and String word, then returns the frequency of
word from the sentence
Ex:
sentence = "Java java java python python"
word = "java";
frequencyOfWord(sentence, word) ==>  3
 */
