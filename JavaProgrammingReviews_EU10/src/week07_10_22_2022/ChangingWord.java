package week07_10_22_2022;

public class ChangingWord {

    public static void main(String[] args) {



        String message="I love cats! I have a cat named Coco. My cat's very smart!";
        String searched="cat";
        String changed="dog";


        while(message.contains(searched)){
            message= message.substring(0,message.indexOf(searched))+changed+
                    message.substring(message.indexOf(searched)+searched.length());

        }

        System.out.println(message);
    }
}
/*
Write a programt that replaces every occurrence of "cat" in the message with "dog", using indexOf and substring.

  input:

  String message = "I love cats! I have a cat named Coco. My cat's very smart!";

  output:

 "I love dogs! I have a dog named Coco. My dog's very smart!";
 */
