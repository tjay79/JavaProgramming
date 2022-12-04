package week07_10_22_2022;

public class CountTheWords {

    public static void main(String[] args) {

        String names="Adam Adam Barry Aysun Aysun";
        String temp="";

        String result="";

        for (int i = 0; i <names.length() ; i++) {

            char ch= names.charAt(i);
            if(ch!=' '){
                temp+=ch;
                continue;
            }
            String search=temp;
            int counter=0;
            String dumy=names;

            while(dumy.contains(search)){
                counter++;
                dumy=dumy.replaceFirst(search,"");

            }
            if(!result.contains(search))
                result+=search+"-"+counter+" ";
            temp="";


        }
        System.out.println(result);


    }
}
