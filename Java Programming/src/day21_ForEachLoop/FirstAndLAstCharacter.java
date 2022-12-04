package day21_ForEachLoop;

public class FirstAndLAstCharacter {

    public static void main(String[] args) {

        String[] words={"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};
        String firstAndLast="";
        for(String each:words){
            firstAndLast=each.charAt(0)+""+each.charAt(each.length()-1);
            System.out.println(firstAndLast);
            firstAndLast="";
        }


        }
    }