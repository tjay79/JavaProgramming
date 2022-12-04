package week3Practice;

public class ChooseLanguage {

    public static void main(String[] args) {

        int selection = 3;

        boolean english = selection==1;
        boolean spanish = selection==2;
        boolean turkish = selection==3;
        boolean russian = selection==4;
        boolean french = selection==5;

        if(english){
            System.out.println("Hello, thank you for your call");
        }else if(spanish){
            System.out.println("Hola, gracias para llamar");
        }else if(turkish){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }else if(russian){
            System.out.println("Privet, spasibo za vash zvonok");
        }else if(french){
            System.out.println("Merci, pour votre appel");
        }else{
            System.out.println("Invalid selection");
        }





    }
}
/*
Creata a class called ChooseLanguage, Given an integer variable named
selection that has a number between 1~5, Write a program that can
select the language based on the number that's given in selection and
prints the following message:
for 1: Hello, thank for your call
for 2: Hola, gracias para llamar
for 3: Merhaba, aradiginiz icin tesekkurler
for 4: Privet, spasibo za vash zvonok
for 5: Merci ,pour votre appel
 */