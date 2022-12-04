package day17_While_DoWhile;

public class FrequencyOfWor_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency=0;

        while(str.contains("Java")){

           str= str.replaceFirst("Java","");
            frequency++;

        }

        System.out.println(frequency);
        System.out.println("--------------------------------------------");

        String str2="Cat cat Dog DOg cAt CAT";

        int frequency2=0;
        str2=str2.toLowerCase();

        while(str2.contains("cat")){
            str2=str2.replaceFirst("cat", "");
            frequency2++;
        }
        System.out.println(frequency2);



    }
}
