package week3Practice;

public class FieldTrip {

    public static void main(String[] args) {

        int gradeNumber = 4;

        boolean one = gradeNumber==1;
        boolean two = gradeNumber==2;
        boolean three = gradeNumber==3;
        boolean four = gradeNumber==4;
        boolean five = gradeNumber==5;

        if(one){
            System.out.println("location - Apple orchard\nnumber of groups - 3\nteacher in charge - Ms. Smith");
        } else if (two) {
            System.out.println("location - zoo\nnumber of groups - 7\nteacher in charge - Mr. Lee");
        } else if (three) {
            System.out.println("location - Aquarium\nnumber of groups - 5\nteacher in charge - Ms. Wilson");
        } else if (four) {
            System.out.println("location - Movie theater\nnumber of groups - 2\nteacher in charge - Ms. Reyes");
        } else if (five) {
            System.out.println("location - Museum\nnumber of groups - 5\nteacher in charge Ms. Lela");
        }else{
            System.out.println("location - Six Flags\nnumber of groups - 8\nteacher in charge - Mr. Watt");
        }


    }
}
