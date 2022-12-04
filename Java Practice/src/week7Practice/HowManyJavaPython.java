package week7Practice;

public class HowManyJavaPython {

    public static void main(String[] args) {

        String sentence="I love python and java";
        String[] words=sentence.split(" ");
        int javaCount=0;
        int pythonCount=0;


        for (String word : words) {
            if(word.equalsIgnoreCase("java")){
                javaCount++;
            }
            if(word.equalsIgnoreCase("python")){
                pythonCount++;
            }
        }
        System.out.println("javaCount = " + javaCount);
        System.out.println("pythonCount = " + pythonCount);


    }
}
/*
Write a program that can return the number of appearances of
âjavaâ and âpythonâ anywhere in the sentence.
(similar to the task 97 in repl.it, but
this time you MUST use arrays and for each loop)
 */
