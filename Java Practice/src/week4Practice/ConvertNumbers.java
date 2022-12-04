package week4Practice;

public class ConvertNumbers {

    public static void main(String[] args) {

        int num = 23;

        String word = (num==1)? "one" : (num==2)?"two":(num==3)?"three":(num==4)?"four":(num==5)?"five":(num==6)?"six":(num==7)?"seven"
                :(num==8)?"eight":(num==9)?"nine":"invalid number";
        System.out.println(word);


    }
}
