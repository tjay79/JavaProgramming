package day22_PracticeTasks;

public class Task2_3 {

    public static void main(String[] args) {

        String[][] items={{"Apple", "Banana", "Grape", "Avocado"},{"Paper Towels", "Toilet Paper", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};



        for (int i = items.length - 1; i >= 0; i--) {

            for (String s : items[i]) {
                System.out.print(s+"\t");
            }
        }







    }
}
