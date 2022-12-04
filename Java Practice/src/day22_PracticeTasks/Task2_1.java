package day22_PracticeTasks;

public class Task2_1 {

    public static void main(String[] args) {

        String[][] items={{"Apple", "Banana", "Grape", "Avocado"},{"Paper Towels", "Toilet Paper", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        for (String[] item : items) {
            for (String s : item) {
                System.out.print(s+"\t");
            }

        }





    }
}
