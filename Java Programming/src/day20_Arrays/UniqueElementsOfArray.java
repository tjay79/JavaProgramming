package day20_Arrays;

public class UniqueElementsOfArray {

    public static void main(String[] args) {

        String[] words={"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad"};
        for (int i = 0; i < words.length; i++) {//The outer loop assigns each variable in the array to the variable element


            String element = words[i];
            int frequency = 0;

            for (int j = 0; j < words.length; j++) {//The inner loop is responsible for finding the frequency of element from Array
                if (words[j].equals(element)) {
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println(element);
            }
        }








    }
}
