package day01_HelloWorld;

public class TestReview {

    public static void main(String[] args) {

        String input="today it will be 100 degrees";
        int n=0;
        String result="";

        while(n++< input.length()){

            if(n==8){
                continue;
            }else if(n==9){
                break;
            }
           result+= (input.charAt(++n));
            System.out.println(result);
        }


    }
}
