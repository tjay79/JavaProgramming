package day24_CustomMethods_Return;

public class ReturnMethodPractice4{

    public static void main(String[] args) {


       String now= removeDuplicates("aaabbbcc");
        System.out.println(now);

    }
    public static String removeDuplicates(String str){

        String result="";
        for(int i =0;i<str.length();i++) {
            if (result.contains(str.charAt(i)+"")){
                continue;

            }else{
                result+=str.charAt(i);
            }

        }
        return result;
    }


}
