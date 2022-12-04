package week3Practice;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 66;

        boolean infant = age >=1 && age<=2;
        boolean toddler = age>=3 && age <=5;
        boolean kid = age>=6 && age <=9;
        boolean preTeen = age >=10 && age <=12;
        boolean teenager = age >=13 && age <=17;
        boolean youngAdult = age >=18 && age <=20;
        boolean adult = age >=21 && age <=39;
        boolean middleAge = age >=40 && age <=49;
        boolean middleAdult = age >=50 && age <=54;
        boolean youngSenior = age >=55 && age<=64;
        boolean youngSenior2 = age >=65 && age <=74;
        boolean senior = age >=75 && age <=84;

        if(infant){
            System.out.println("Infant");
        }else if(toddler){
            System.out.println("Toddler");
        } else if (kid) {
            System.out.println("Kid");
        } else if (preTeen) {
            System.out.println("Pre-teen");
        } else if (teenager) {
            System.out.println("Teenager");
        } else if (youngAdult) {
            System.out.println("Young adult");
        } else if (adult) {
            System.out.println("Adult");
        } else if (middleAge) {
            System.out.println("Young middle-aged adult");
        } else if (middleAdult) {
            System.out.println("Middle-aged adult");
        } else if (youngSenior) {
            System.out.println("Very young senior citizen");
        } else if (youngSenior2) {
            System.out.println("Young senior citizen");
        } else if (senior) {
            System.out.println("Senior citizen");
        }else{
            System.out.println("Old senior citizen");
        }


    }
}
/*
Create a class called EqualNumbers, and write a program that can check
the equality of the three given numberrs
 declare 3 numbers n1, n2, n3
 if all are equal ==> print "all equal"
  if only n1 and n2 are equal
=>print  "n1&n2 are equal"
   if only n2 and n3 are equal
==>print "n2&n3 are equal"
   if only n3 and n1 are qual
==>print "n3&n1 are equal"
if none of them are euqal ==> none of
them are equal
 */